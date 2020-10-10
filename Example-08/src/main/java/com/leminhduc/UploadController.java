package com.leminhduc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.input.ReaderInputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	private static final String UPLOAD_DIRECTORY ="/images";
	@RequestMapping("uploadform")
	public ModelAndView uploadForm() {
		return new ModelAndView("uploadform");
	}
	@RequestMapping(value="savefile",method=RequestMethod.POST)
	public ModelAndView saveimage(@RequestParam CommonsMultipartFile file,
			HttpSession session) throws Exception{
		ServletContext context = session.getServletContext();
		String path = context.getRealPath(UPLOAD_DIRECTORY);
		String filename = file.getOriginalFilename();
		byte[] bytes = file.getBytes();
		BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(
				new File(path + File.separator + filename)));
		stream.write(bytes);
		stream.flush();
		stream.close();
		ModelAndView mv = new ModelAndView("display-image");
		mv.addObject("filename", filename);
		return mv;
	}
}
