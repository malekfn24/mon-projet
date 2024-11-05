package tn.esprit.tpfoyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class TpFoyerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpFoyerApplication.class, args);
        System.out.println("L'application TpFoyer a démarré avec succès !");
        // Nouvelle ligne ajoutée pour le commit
// Nouvelle ligne ajoutée pour le commit de branch
        System.out.println("Version 1.0.0 de TpFoyer est en cours d'exécution.");
    }

}
