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

    private TextView weatherTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        weatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        String[] weatherData = {
                "Today, July 31 - Clear - 10°C / 15°C",
                "Tomorrow, August 1 - Clear - 10°C / 15°C",
                "August 2 - Clear - 10°C / 15°C",
                "August 3 - Clear - 10°C / 15°C",
                "August 4 - Clear - 10°C / 15°C",
                "August 5 - Clear - 10°C / 15°C",
                "August 6 - Clear - 10°C / 15°C",
                "August 7 - Clear - 10°C / 15°C",
                "August 8 - Clear - 10°C / 15°C",
                "August 9 - Clear - 10°C / 15°C"
        };

        for (String weather: weatherData) {
            weatherTextView.append(weather + "\n\n\n");
        }
    }
}