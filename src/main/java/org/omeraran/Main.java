package org.omeraran;

import org.omeraran.model.Linkedin;
import org.omeraran.service.LinkedinService;


public class Main {
    public static void main(String[] args)  {
        Linkedin linkedin = new Linkedin();
        LinkedinService linkedinService = new LinkedinService();
        try {
            linkedinService.removeAllFollowings(linkedin);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}