package g6;

import i6.s;
import j71.e;
import k5.f;
import z5.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements e {

    /* renamed from: s, reason: collision with root package name */
    public static final a f24777s = new a(0);

    /* renamed from: t, reason: collision with root package name */
    public static final a f24778t = new a(1);

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24779r;

    public /* synthetic */ a(int i) {
        this.f24779r = i;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.f24779r) {
            case f.J:
                m mVar = (m) obj2;
                return mVar instanceof s ? mVar : obj;
            default:
                m mVar2 = (m) obj2;
                return mVar2 instanceof i6.m ? mVar2 : obj;
        }
    }
}
