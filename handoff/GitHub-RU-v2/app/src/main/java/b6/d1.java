package b6;

import android.content.Context;

/* loaded from: /home/user/work/p/classes.dex */
public final class d1 extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public Context f3516u;

    /* renamed from: v, reason: collision with root package name */
    public int f3517v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3518w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f3519x;

    /* renamed from: y, reason: collision with root package name */
    public int f3520y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(v vVar, c71.c cVar) {
        super(cVar);
        this.f3519x = vVar;
    }

    public final Object v(Object obj) {
        this.f3518w = obj;
        this.f3520y |= Integer.MIN_VALUE;
        return this.f3519x.c(null, 0, this);
    }
}
