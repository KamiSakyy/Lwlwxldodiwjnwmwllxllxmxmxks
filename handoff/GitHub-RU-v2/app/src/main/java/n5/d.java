package n5;

import com.google.android.gms.internal.measurement.i4;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29511v;

    /* renamed from: w, reason: collision with root package name */
    public int f29512w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f29513x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f29514y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(List list, a71.c cVar, int i) {
        super(2, cVar);
        this.f29511v = i;
        this.f29514y = list;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f29511v) {
            case k5.f.J:
                d dVar = new d(this.f29514y, cVar, 0);
                dVar.f29513x = obj;
                return dVar;
            default:
                d dVar2 = new d(this.f29514y, cVar, 1);
                dVar2.f29513x = obj;
                return dVar2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.f29511v) {
            case k5.f.J:
                return r((a71.c) obj2, (j) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (y71.j) obj).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.f29511v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f29512w;
                if (i == 0) {
                    sy.y.j(obj);
                    j jVar = (j) this.f29513x;
                    this.f29512w = 1;
                    if (i4.J(this.f29514y, jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                y71.j jVar2 = (y71.j) this.f29513x;
                b71.a aVar2 = b71.a.r;
                int i10 = this.f29512w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    List list = this.f29514y;
                    k71.k.g(list, "<this>");
                    List v02 = x61.m.v0(list, new bm.m(0, list));
                    this.f29513x = null;
                    this.f29512w = 1;
                    if (jVar2.c(v02, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}
