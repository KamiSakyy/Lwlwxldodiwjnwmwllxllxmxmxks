package com.github.rudroid.webview.viewholders;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(new int[]{0}, 1, 1, Bitmap.Config.ARGB_8888);
    }
}
