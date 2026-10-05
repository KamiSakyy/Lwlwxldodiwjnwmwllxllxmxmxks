package p5;

import h91.d0;
import h91.v;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public v f30398u;

    /* renamed from: v, reason: collision with root package name */
    public v f30399v;

    /* renamed from: w, reason: collision with root package name */
    public d0 f30400w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f30401x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f30402y;

    /* renamed from: z, reason: collision with root package name */
    public int f30403z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, c71.c cVar) {
        super(cVar);
        this.f30402y = jVar;
    }

    public final Object v(Object obj) {
        this.f30401x = obj;
        this.f30403z |= Integer.MIN_VALUE;
        return this.f30402y.d(this, null);
    }
}
