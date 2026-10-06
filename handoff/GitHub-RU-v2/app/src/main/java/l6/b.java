package l6;

import android.content.Context;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends c71.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public Context f28018u;

    /* renamed from: v, reason: collision with root package name */
    public g f28019v;

    /* renamed from: w, reason: collision with root package name */
    public String f28020w;

    /* renamed from: x, reason: collision with root package name */
    public e81.c f28021x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f28022y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f f28023z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, c71.c cVar) {
        super(cVar);
        this.f28023z = fVar;
    }

    public final Object v(Object obj) {
        this.f28022y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f28023z.a(null, null, null, this);
    }
}
