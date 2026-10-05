package kf;

import android.content.Context;
import android.net.Uri;
import com.github.rudroid.utilities.i1;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static void a(Context context, String str, String str2) {
        k.g(str, "url");
        k.g(str2, "author");
        Uri build = Uri.parse("https://github.com/contact/report-content").buildUpon().appendQueryParameter("content_url", str).appendQueryParameter("report", str2.concat(" (user)")).build();
        k.f(build, "build(...)");
        i1.f(context, build);
    }
}
