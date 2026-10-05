package dc;

import com.github.rudroid.copilot.u4;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class m implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21758r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.e f21759s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u4.a f21760t;

    public /* synthetic */ m(j71.e eVar, u4.a aVar, int i) {
        this.f21758r = i;
        this.f21759s = eVar;
        this.f21760t = aVar;
    }

    public final Object a() {
        switch (this.f21758r) {
            case k5.f.J:
                this.f21759s.s(this.f21760t.f10062b, Boolean.FALSE);
                break;
            default:
                this.f21759s.s(this.f21760t.f10062b, Boolean.TRUE);
                break;
        }
        return a0.a;
    }
}
