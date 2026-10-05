package com.github.rudroid.utilities;

import android.net.Uri;
import com.github.service.models.response.Avatar;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public static final String a(String str, int i) {
        k71.k.g(str, "url");
        try {
            Uri parse = Uri.parse(str);
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.clearQuery();
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            k71.k.f(queryParameterNames, "getQueryParameterNames(...)");
            for (String str2 : queryParameterNames) {
                if (!k71.k.b(str2, "s")) {
                    buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
                }
            }
            String builder = buildUpon.appendQueryParameter("s", String.valueOf(i)).toString();
            k71.k.f(builder, "toString(...)");
            return builder;
        } catch (Exception unused) {
            return str;
        }
    }

    public static final String b(Avatar avatar, int i) {
        k71.k.g(avatar, "<this>");
        return a(avatar.r, i);
    }
}
