package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;

import com.example.android.sunshine.sync.SunshineSyncIntentService;

public class SunshineSyncUtils {
    public static void startImmediateSync(Context context) {
        context.startService(new Intent(context, SunshineSyncIntentService.class));
    }
}