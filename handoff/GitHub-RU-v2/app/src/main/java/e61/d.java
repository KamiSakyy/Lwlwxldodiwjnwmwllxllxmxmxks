package e61;

import android.net.Uri;
import java.net.URL;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final a61.b a;
    public final a71.h b;

    public d(a61.b bVar, a71.h hVar) {
        k.g(bVar, "appInfo");
        k.g(hVar, "blockingDispatcher");
        this.a = bVar;
        this.b = hVar;
    }

    public static final URL a(d dVar) {
        dVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        a61.b bVar = dVar.a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        a61.a aVar = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.c).appendQueryParameter("display_version", aVar.b).build().toString());
    }
}
