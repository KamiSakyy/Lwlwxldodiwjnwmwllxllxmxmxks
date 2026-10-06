package b10;

import bd.m;
import c10.n;
import com.google.android.gms.internal.measurement.d5;
import ga.h;
import java.util.Set;
import jn0.yf0;
import jo.mi0;
import k71.k;
import kc0.yb0;
import u10.y90;
import v71.v;
import xn.q1;
import y71.i;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements b11.a, mi0, y90, yf0, yb0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.b s;
    public v t;

    public c(com.github.service.wrapper.b bVar, v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k.g(bVar, "cachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            case 2:
                k.g(bVar, "cachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            case 3:
                k.g(bVar, "cachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            default:
                k.g(bVar, "cachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
        }
    }

    public final i a(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k.g(str2, "owner");
                k.g(str3, "name");
                return n1Shadow.y(new b(d5.R(com.github.service.wrapper.a.b(this.s, new n(str, str2, str3), (h) null, false, (Set) null, (Set) null, new m(str2, 8), new a7.i(13), 30)), 0), this.t);
            case 1:
                k.g(str2, "owner");
                k.g(str3, "name");
                return n1Shadow.y(new b(d5.R(com.github.service.wrapper.a.b(this.s, new cc0.n(str, str2, str3), (h) null, false, (Set) null, (Set) null, new m(str2, 8), new a7.i(26), 30)), 1), this.t);
            case 2:
                k.g(str2, "owner");
                k.g(str3, "name");
                return n1Shadow.y(new b(d5.R(com.github.service.wrapper.a.b(this.s, new fz0.n(str, str2, str3), (h) null, false, (Set) null, (Set) null, new m(str2, 8), new ef.b(10), 30)), 3), this.t);
            default:
                k.g(str2, "owner");
                k.g(str3, "name");
                return n1Shadow.y(new b(d5.R(com.github.service.wrapper.a.b(this.s, new zm0.n(str, str2, str3), (h) null, false, (Set) null, (Set) null, new m(str2, 8), new q1(15), 30)), 15), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
