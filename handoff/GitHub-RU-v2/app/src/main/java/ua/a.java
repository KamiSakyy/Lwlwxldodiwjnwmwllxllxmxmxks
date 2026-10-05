package ua;

import android.content.Context;
import k71.k;
import mn.m;
import t71.p;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static final String a(m mVar, Context context) {
        int i = mVar.f;
        int i10 = mVar.a;
        int i11 = mVar.d;
        int i12 = mVar.c;
        int i13 = mVar.e;
        k.g(context, "context");
        StringBuilder sb2 = new StringBuilder();
        int i14 = mVar.b;
        if (i14 > 0) {
            if (!p.T(sb2)) {
                sb2.append(", ");
            }
            sb2.append(context.getResources().getQuantityString(2131820551, i14, Integer.valueOf(i14)));
        }
        if (i13 > 0) {
            if (!p.T(sb2)) {
                sb2.append(", ");
            }
            sb2.append(context.getResources().getQuantityString(2131820555, i13, Integer.valueOf(i13)));
        }
        if (i12 > 0) {
            if (!p.T(sb2)) {
                sb2.append(", ");
            }
            sb2.append(context.getResources().getQuantityString(2131820552, i12, Integer.valueOf(i12)));
        }
        if (i11 > 0) {
            if (!p.T(sb2)) {
                sb2.append(", ");
            }
            sb2.append(context.getResources().getQuantityString(2131820556, i11, Integer.valueOf(i11)));
        }
        if (i10 > 0) {
            if (!p.T(sb2)) {
                sb2.append(", ");
            }
            sb2.append(context.getResources().getQuantityString(2131820554, i10, Integer.valueOf(i10)));
        }
        if (i > 0) {
            if (!p.T(sb2)) {
                sb2.append(", ");
            }
            sb2.append(context.getResources().getQuantityString(2131820553, i, Integer.valueOf(i)));
        }
        String sb3 = sb2.toString();
        k.f(sb3, "toString(...)");
        return sb3;
    }
}
