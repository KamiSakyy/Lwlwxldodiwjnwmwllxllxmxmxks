package vl;

import c71.j;
import sy.y;
import w61.a0;
import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends j implements j71.e {
    public final /* synthetic */ w01.a A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public /* synthetic */ Object v;
    public final /* synthetic */ b w;
    public final /* synthetic */ oa.j x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, oa.j jVar, String str, String str2, w01.a aVar, String str3, boolean z, a71.c cVar) {
        super(2, cVar);
        this.w = bVar;
        this.x = jVar;
        this.y = str;
        this.z = str2;
        this.A = aVar;
        this.B = str3;
        this.C = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        a aVar = new a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, cVar);
        aVar.v = obj;
        return aVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (String) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        String str = (String) this.v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        return ((g1) this.w.a.a(this.x)).E(this.y, this.z, str, this.A, this.B, this.C);
    }
}
