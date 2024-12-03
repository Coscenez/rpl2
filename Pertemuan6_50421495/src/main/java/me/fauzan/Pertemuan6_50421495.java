package me.fauzan;

/**
 *
 * @author Fauzan
 */

import me.fauzan.controller.MahasiswaController;
import me.fauzan.service.MahasiswaService;
import me.fauzan.view.MahasiswaView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Pertemuan6_50421495 implements ApplicationRunner {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        ApplicationContext context = SpringApplication.run(Pertemuan6_50421495.class, args);
        
        MahasiswaController controller = context.getBean(MahasiswaController.class);
        MahasiswaView mahasiswaView = new MahasiswaView(controller);
        mahasiswaView.setVisible(true);
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        
    }
}
