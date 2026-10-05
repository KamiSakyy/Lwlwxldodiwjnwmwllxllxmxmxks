package me;

import com.github.rudroid.utilities.s2;
import java.util.List;
import k71.k;
import me.f;
import me.i;
import sy.d0;
import x61.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static final List a(com.github.service.models.response.a aVar, boolean z10) {
        k.g(aVar, "<this>");
        String str = aVar.z;
        boolean z11 = aVar.v;
        i.f fVar = i.f.f29236a;
        return z11 ? l.r(new h[]{new h(new f.b(str), new i.e(s2.a.r, z10)), new h(new f.b(" Agent "), fVar)}) : aVar.u ? l.r(new h[]{new h(new f.b(str), new i.e(s2.a.r, z10)), new h(new f.b(" AI "), fVar)}) : d0.n(new h(new f.b(str), new i.e(s2.a.r, z10)));
    }

    public static final String b(com.github.service.models.response.a aVar) {
        k.g(aVar, "<this>");
        String str = aVar.z;
        return aVar.v ? x.i.f(str, "  Agent ") : aVar.u ? x.i.f(str, "  AI ") : str;
    }
}
