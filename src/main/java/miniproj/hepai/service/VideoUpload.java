package miniproj.hepai.service;

import com.qcloud.vod.VodApi;
import com.qcloud.vod.response.VodUploadCommitResponse;

public class VideoUpload {
    private String videoLocation;
    public static void main(String[] args){
        VodApi vodApi = new VodApi("AKIDf9ON7bYtgFZgaFQqmUxFJCrJXVEhBshG", "SfdMq56rRs53nJcgWBcolU6VfbJlywf8");
        try {
            VodUploadCommitResponse response = vodApi.upload("C:/Users/arionliu/Documents/test1.mp4");
            System.out.println(response.getFileId());
        }catch (Exception e){
            System.out.println("upload faild");
        }
    }
}
