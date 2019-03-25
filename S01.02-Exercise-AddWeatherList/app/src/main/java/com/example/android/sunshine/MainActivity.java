/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //COMPLETED TODO (1) Create a field to store the weather display TextView

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        //COMPLETED  TODO (2) Use findViewById to get a reference to the weather display TextView
            display= (TextView)findViewById(R.id.tv_weather_data);
        // COMPLETED TODO (3) Create an array of Strings that contain fake weather data
        String [] dummyWeatherData = {
                " Hoje, 17 de maio - Claro - 17 ° C / 15 ° C " ,
                " Amanhã - Nublado - 19 ° C / 15 ° C " ,
                " Quinta-feira - chuvosa - 30 ° C / 11 ° C " ,
                " Sexta-feira - trovoadas - 21 ° C / 9 ° C " ,
                " Sábado - Trovoadas - 16 ° C / 7 ° C " ,
                " Domingo - Chuvoso - 16 ° C / 8 ° C " ,
                " Segunda-feira - Parcialmente nublado - 15 ° C / 10 ° C " ,
                " Ter, 24 de maio - almôndegas - 16 ° C / 18 ° C " ,
                " Qua, 25 de maio - Nublado - 19 ° C / 15 ° C " ,
                " Qui, 26 de maio - Tempestuoso - 30 ° C / 11 ° C " ,
                " Sexta, 27 de maio - Furacão - 21 ° C / 9 ° C " ,
                " Sábado, 28 de maio - Meteoros - 16 ° C / 7 ° C " ,
                " Sun, 29 de maio - Apocalypse - 16 ° C / 8 ° C " ,
                " Seg, 30 de maio - pós Apocalipse - 15 ° C / 10 ° C " ,
        };
        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String dummyWeatherDay : dummyWeatherData) {
           display.append(dummyWeatherDay + "\n\n\n");
        }
    }
 
}