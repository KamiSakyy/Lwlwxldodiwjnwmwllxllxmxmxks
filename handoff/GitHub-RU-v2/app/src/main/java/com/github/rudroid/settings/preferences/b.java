package com.github.rudroid.settings.preferences;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import k.l;
import k.n;
import k71.k;
import t71.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context) {
        w4.c cVar;
        String str;
        boolean z;
        k.g(context, "context");
        String[] stringArray = context.getResources().getStringArray(2130903064);
        k.f(stringArray, "getStringArray(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            Object b = n.b();
            if (b != null) {
                cVar = new w4.c(new w4.d(l.a(b)));
            }
            cVar = w4.c.b;
        } else {
            cVar = n.t;
        }
        Locale locale = cVar.a.a.get(0);
        int length = stringArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = stringArray[i];
            k.d(str2);
            if (p.T(str2)) {
                z = false;
            } else {
                String substring = str2.substring(0, 2);
                k.f(substring, "substring(...)");
                z = substring.equals(locale != null ? locale.getLanguage() : null);
            }
            if (z) {
                str = str2;
                break;
            }
            i++;
        }
        return str == null ? "" : str;
    }
    public Object y(Object p1, Object p2, Object p3) { return null; }
}
