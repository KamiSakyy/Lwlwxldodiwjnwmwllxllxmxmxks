package l10;

import android.os.Build;
import android.util.Base64;
import com.github.service.wrapper.j;
import i10.a0;
import i10.q;
import i10.w;
import in.rShadow;
import java.util.LinkedHashSet;
import java.util.Set;
import jo.mi0;
import k71.k;
import m10.wo;
import m10.xo;
import t71.p;
import v71.v;
import y00.l;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements e11.a, mi0 {
    public static final a Companion = new a();
    public j r;
    public com.github.service.wrapper.b s;
    public v t;

    public i(j jVar, com.github.service.wrapper.b bVar, v vVar) {
        k.g(jVar, "client");
        k.g(bVar, "cachedClient");
        k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
    }

    public final Object a(int i, byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 0);
        k.f(encodeToString, "encodeToString(...)");
        return n1Shadow.y(new az0.c(new l(rShadow.h(this.rShadow.d(new i10.h(encodeToString, i))), 10), 16), this.t);
    }

    public final Object b(String str, e11.b bVar, String str2, boolean z) {
        String str3 = Build.MODEL;
        return n1Shadow.y(new az0.c(new l(rShadow.h(this.rShadow.d(new i10.d(str, xo.t, bVar.a, bVar.b, str2, str3, z))), 10), 15), this.t);
    }

    public final Object c(String str, e11.b bVar, String str2, boolean z) {
        String str3 = Build.MODEL;
        String str4 = bVar.a;
        String str5 = bVar.b;
        xo xoVar = xo.s;
        if (p.T(str2)) {
            str2 = "Unknown Android Device";
        }
        String str6 = str2;
        if (p.T(str3)) {
            str3 = "Unknown Android Device Model";
        }
        return n1Shadow.y(new az0.c(new l(rShadow.h(this.rShadow.d(new i10.d(str, xoVar, str4, str5, str6, str3, z))), 10), 14), this.t);
    }

    public final y71.i d() {
        return com.github.rudroid.common.v.b(new gl.f(com.github.service.wrapper.b.a(this.s, new q(), ga.h.r, false, (LinkedHashSet) null, 56), 14), this.t);
    }

    public final Object e() {
        wo woVar = xo.Companion;
        return n1Shadow.y(new az0.c(new l(rShadow.h(this.rShadow.d(new i10.l())), 10), 17), this.t);
    }

    public final Object f() {
        return com.github.rudroid.common.v.b(new az0.c(new l(com.github.service.wrapper.a.o(this.s, new w(), ga.h.s, false, (LinkedHashSet) null, (Set) null, 56), 10), 18), this.t);
    }

    public final Object g(int i) {
        return n1Shadow.y(new az0.c(new l(rShadow.h(this.rShadow.d(new a0(i))), 10), 19), this.t);
    }

    public final Object h() {
        return this;
    }
}
