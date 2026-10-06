package oz0;

import android.os.Build;
import android.util.Base64;
import com.github.service.wrapper.j;
import in.r;
import jn0.yf0;
import k71.k;
import lz0.a0;
import lz0.q;
import lz0.w;
import pz0.vj;
import pz0.wj;
import t71.p;
import v71.v;
import y00.l;
import y71.i;
import y71.n1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements e11.a, yf0 {
    public j r;
    public com.github.service.wrapper.b s;
    public v t;

    public h(j jVar, com.github.service.wrapper.b bVar, v vVar) {
        k.g(jVar, "client");
        k.g(bVar, "cachedClient");
        k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
    }

    @Override // e11.a
    public final Object a(int i, byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 0);
        k.f(encodeToString, "encodeToString(...)");
        return n1.y(new az0.c(new l(r.h(this.r.d(new lz0.h(encodeToString, i))), 10), 23), this.t);
    }

    @Override // e11.a
    public final Object b(String str, e11.b bVar, String str2, boolean z) {
        String str3 = Build.MODEL;
        return n1.y(new az0.c(new l(r.h(this.r.d(new lz0.d(str, wj.t, bVar.a, bVar.b, str2, str3, z))), 10), 22), this.t);
    }

    @Override // e11.a
    public final Object c(String str, e11.b bVar, String str2, boolean z) {
        String str3 = Build.MODEL;
        String str4 = bVar.a;
        String str5 = bVar.b;
        wj wjVar = wj.s;
        if (p.T(str2)) {
            str2 = "Unknown Android Device";
        }
        String str6 = str2;
        if (p.T(str3)) {
            str3 = "Unknown Android Device Model";
        }
        return n1.y(new az0.c(new l(r.h(this.r.d(new lz0.d(str, wjVar, str4, str5, str6, str3, z))), 10), 21), this.t);
    }

    @Override // e11.a
    public final i d() {
        return com.github.rudroid.common.v.b(new gl.f(com.github.service.wrapper.b.a(this.s, new q(), ga.h.r, false, null, 56), 18), this.t);
    }

    @Override // e11.a
    public final Object e() {
        vj vjVar = wj.Companion;
        return n1.y(new az0.c(new l(r.h(this.r.d(new lz0.l())), 10), 24), this.t);
    }

    @Override // e11.a
    public final Object f() {
        return com.github.rudroid.common.v.b(new az0.c(new l(com.github.service.wrapper.a.o(this.s, new w(), ga.h.s, false, null, null, 56), 10), 25), this.t);
    }

    @Override // e11.a
    public final Object g(int i) {
        return n1.y(new az0.c(new l(r.h(this.r.d(new a0(i))), 10), 26), this.t);
    }

    public final Object h() {
        return this;
    }
}
