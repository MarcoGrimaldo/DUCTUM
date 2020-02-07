/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductum;

/**
 *
 * @author Vosko
 */
public class sistema_DUCTUM 
{
    public sistema_DUCTUM()
    {
    
    }
    
    public void registraIncidencia(int tipo)
    {
        //Guarda en la base de datos
    }
    
    public void analisis(String CurpAlumn)
    {   
        //Cuantas incidencias ha tenido al mes. 
        //Obteniendolo de la base de datos
        int in_agre_verb = 5;
        int in_robo = 9;
        int in_dif = 22;
        int in_agre_fis = 14;
        int in_disc = 18;
        int in_ext = 22;
        int in_agre_sex = 11;
        int in_deso = 10;
        int in_ansi = 6;
        int in_mala_com = 0;
        int in_acoso = 20;
        int in_ensimi = 2;
        int in_desaf = 4;
        int in_inq = 10;
        int in_bus_aten = 10;
        
        //Promedio incidencias de nivel 1 en porcentaje
        
        float prom_n1 = (((in_inq + in_deso)/2)*100)/30;
        
        //Promedio incidencias de nivel 2 en porcentaje 
        
        float prom_n2 = (((in_agre_verb + in_disc + in_ansi + in_desaf)/4)*100)/30;
        
        //Promedio incidencias de nivel 3 en porcentaje
        
        float prom_n3 = (((in_dif + in_agre_fis  + in_ensimi + in_bus_aten)/4)*100)/30;
                
        //Promedio incidencias de nivel 4 en porcentaje
        
        float prom_n4 = (((in_mala_com + in_acoso)/2)*100)/30;
                
        //Promedio incidencias de nivel 5 en porcentaje
        
        float prom_n5 = (((in_robo + in_agre_sex + in_ext)/3)*100)/30;
        
        //Promedio general
        
        float prom_gen = (prom_n1 + prom_n2 + prom_n3 + prom_n4 + prom_n5)/5;
        
        System.out.println("Promedio de incidencias de nivel 1 en porcentaje: "+prom_n1+"%");
        System.out.println("Promedio de incidencias de nivel 2 en porcentaje: "+prom_n2+"%");
        System.out.println("Promedio de incidencias de nivel 3 en porcentaje: "+prom_n3+"%");
        System.out.println("Promedio de incidencias de nivel 4 en porcentaje: "+prom_n4+"%");
        System.out.println("Promedio de incidencias de nivel 5 en porcentaje: "+prom_n5+"%");
        
        System.out.println("\nPromedio general: "+prom_gen+"%");
        
        if(prom_n1 > 10)
        {
            //Recomendacion para nivel 1, Desovedencia e Inquietud
            
            if(in_inq > 20)
            {
                //Recomendacion  de enfasis para inquietud
                if(in_deso < 5)
                {
                    //Recomendacion si la inquietud es mayor que la desovedencia
                }
            }
            if(in_deso > 20)
            {
                //Recomendacion de enfasis para desovedencia
                if(in_inq < 5)
                {
                    //Recomendacion si la desovedencia es mayor que la inquietud
                }
            }  
        }
        
        if(prom_n2 > 10)
        {
            //Recomendacion para nivel 2, Agresion verbal, Discriminacion, Ansiedad, Desafiante
            
            if(in_agre_verb > 20)
            {
                //Recomendacion  de enfasis para Agresion verbal
                if(in_disc < 5)
                {
                    //Recomendacion si la Agresion verbal es mayor que la Discriminacion
                }
                if(in_ansi < 5)
                {
                    //Recomendacion si la Agresion verbal es mayor que la Ansiedad
                }
                if(in_desaf < 5)
                {
                    //Recomendacion si la Agresion verbal es mayor que la Desafiante
                }
            }
            if(in_disc > 20)
            {
                //Recomendacion  de enfasis para Discriminacion
                if(in_agre_verb < 5)
                {
                    //Recomendacion si la Discriminacion es mayor que la Agresion verbal
                }
                if(in_ansi < 5)
                {
                    //Recomendacion si la Discriminacion es mayor que la Ansiedad
                }
                if(in_desaf < 5)
                {
                    //Recomendacion si la Discriminacion es mayor que la Desafiante
                }
            }
            if(in_ansi > 20)
            {
                //Recomendacion  de enfasis para Ansiedad
                if(in_desaf < 5)
                {
                    //Recomendacion si la Ansiedad es mayor que la Desafiante
                }
                if(in_agre_verb < 5)
                {
                    //Recomendacion si la Ansiedad es mayor que la Agresion verbal
                }
                if(in_disc < 5)
                {
                    //Recomendacion si la Ansiedad es mayor que la Discriminacion
                }
                
            }
            if(in_desaf > 20)
            {
                //Recomendacion de enfasis para Desafiante
                if(in_agre_verb < 5)
                {
                    //Recomendacion si Desafiante es mayor que la Agresion verbal
                }
                if(in_disc < 5)
                {
                    //Recomendacion si Desafiante es mayor que la Discriminacion
                }
                if(in_ansi < 5)
                {
                    //Recomendacion si Desafiante es mayor que la Ansiedad
                }
            }
        }
        
        if(prom_n3 > 10)
        {
            //Recomendacion para nivel 3, Difamacion, Agresion fisica, Ensimismarse, Buscar Atencion
            
            if(in_dif > 20)
            {
                //Recomendacion  de enfasis para Difamacion
                if(in_agre_fis < 5)
                {
                    //Recomendacion si la Difamacion es mayor que la Agresion fisica
                }
                if(in_ensimi < 5)
                {
                    //Recomendacion si la Difamacion es mayor que Ensimismarse
                }
                if(in_bus_aten < 5)
                {
                    //Recomendacion si la Difamacion es mayor que Buscar Atencion
                }
            }
            if(in_agre_fis > 20)
            {
                //Recomendacion  de enfasis para Agresion fisica
                if(in_dif < 5)
                {
                    //Recomendacion si la Agresion fisica es mayor que la Difamacion
                }
                if(in_ensimi < 5)
                {
                    //Recomendacion si la Agresion fisica es mayor que Ensimismarse
                }
                if(in_bus_aten < 5)
                {
                    //Recomendacion si la Agresion fisica es mayor que Buscar Atencion
                }
            }
            if(in_ensimi > 20)
            {
                //Recomendacion  de enfasis para Ensimismarse
                if(in_agre_fis < 5)
                {
                    //Recomendacion si la Ensimismarse es mayor que la Agresion fisica
                }
                if(in_dif < 5)
                {
                    //Recomendacion si la Ensimismarse es mayor que la Difamacion
                }
                if(in_bus_aten < 5)
                {
                    //Recomendacion si la Ensimismarse es mayor que la Buscar Atencion
                }
                
            }
            if(in_bus_aten > 20)
            {
                //Recomendacion de enfasis para Buscar Atencion
                if(in_dif < 5)
                {
                    //Recomendacion si Buscar Atencion es mayor que la Difamacion
                }
                if(in_agre_fis < 5)
                {
                    //Recomendacion si Buscar Atencion es mayor que la Agresion fisica
                }
                if(in_ensimi < 5)
                {
                    //Recomendacion si Buscar Atencion es mayor que  Ensimismarse
                }
            }
        }
        
        if(prom_n4 > 10)
        {
            //Recomendacion para nivel 4, Mala Comunicacion y Acoso/Bulling
            if(in_mala_com > 15)
            {
                //Recomendacion de enfasis para Mala Comunicacion
                if(in_acoso < 5)
                {
                    //Recomendacion si Mala Comunicacion es mayor que Acoso/Bulling
                }
            }
            if(in_acoso > 15)
            {
                //Recomendacion de enfasis para Acoso/Bulling
                if(in_mala_com < 5)
                {
                    //Recomendacion si Acoso/Bulling es mayor que Mala Comunicacion
                }
            }
        }
        
        if(prom_n5 > 10)
        {
            //Recomendacion para nivel 5, Robo, Extorsion y Agresion Sexual
            if(in_robo > 2)
            {
                //Recomendacion de enfasis para Robo
            }
            if(in_agre_sex > 5)
            {
                //Recomendacion de enfasis para Agresion Sexual
            }
            if(in_ext > 8)
            {
                //Recomendacion de enfasis para Extorsion
            }
        }
    }
    
    public static void main(String[] args) {
        
        sistema_DUCTUM xd = new sistema_DUCTUM();
        
        xd.analisis("asd");
    }
    
}
