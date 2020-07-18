File file = new File(filePathName);
FileInfoPackage fileInfo = new FileInfoPackage();

// 数据包准备
fileInfo.setStatus(fileExist);
fileInfo.setName(fileName);
fileInfo.setLength(fileLength);

// 转换为JSON格式
JSONObject sendObject = JSONObject.fromObject(fileInfo);


