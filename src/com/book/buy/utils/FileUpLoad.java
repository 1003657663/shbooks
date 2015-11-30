package com.book.buy.utils;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
*
*	@author Nvpiao
*	@time:2015年11月14日 下午8:23:32
*/
public class FileUpLoad {
    /**
     * 上传文件的方法
     * @param request
     * @param response
     */
    public static String loadFileUp(HttpServletRequest request){
	DiskFileItemFactory factory = new DiskFileItemFactory();
	
	ServletFileUpload upload = new ServletFileUpload(factory);
	try {
		List<FileItem> list = upload.parseRequest(request);
		
		for(int i = 0; i < list.size(); ++i){
			FileItem item = list.get(i);
			if(!item.isFormField()){
				String filename = item.getName();
				String extName = filename.substring(filename.lastIndexOf("."));
				String newName = UUID.randomUUID().toString();
				String rootPath = request.getServletContext().getRealPath("/images");
				String newPath = rootPath + "/" + newName + extName;
				item.write(new File(newPath));
				return newPath;
			}
		}
		
	} 
	catch (FileUploadException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
    }
}
