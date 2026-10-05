package t61;

import android.app.ActivityManager;
import android.net.Uri;
import es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import l7.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends Thread {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ d(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int size;
        boolean z;
        switch (this.r) {
            case 0:
                break;
            default:
                HashMap hashMap = (HashMap) this.s;
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            new StringBuilder(String.valueOf(uri).length() + 65);
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    new StringBuilder(String.valueOf(e.getMessage()).length() + String.valueOf(uri).length() + 27);
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    new StringBuilder(String.valueOf(e2.getMessage()).length() + String.valueOf(uri).length() + 32);
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    new StringBuilder(String.valueOf(e.getMessage()).length() + String.valueOf(uri).length() + 27);
                    return;
                } finally {
                }
        }
        while (true) {
            SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = (SkiaPooledImageRegionDecoder) this.s;
            x1 x1Var = skiaPooledImageRegionDecoder.a;
            if (x1Var == null) {
                return;
            }
            synchronized (x1Var) {
                size = ((ConcurrentHashMap) x1Var.s).size();
            }
            long j = ((SkiaPooledImageRegionDecoder) this.s).f;
            boolean z2 = false;
            if (size < 4 && size * j <= 20971520) {
                if (size >= Runtime.getRuntime().availableProcessors()) {
                    Runtime.getRuntime().availableProcessors();
                } else {
                    ActivityManager activityManager = (ActivityManager) skiaPooledImageRegionDecoder.d.getSystemService("activity");
                    if (activityManager != null) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        activityManager.getMemoryInfo(memoryInfo);
                        z = memoryInfo.lowMemory;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                return;
            }
            try {
                if (((SkiaPooledImageRegionDecoder) this.s).a != null) {
                    System.currentTimeMillis();
                    ((SkiaPooledImageRegionDecoder) this.s).e();
                    System.currentTimeMillis();
                }
            } catch (Exception e4) {
                e4.getMessage();
            }
        }
    }
}
