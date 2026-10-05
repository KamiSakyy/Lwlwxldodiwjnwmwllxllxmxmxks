package d8;

import android.security.KeyStoreException;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.datatransport.TransportRegistrar;
import l3.c0;
import l3.e0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class m implements n, e2.i, p41.d, e0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21637r;

    public /* synthetic */ m(int i) {
        this.f21637r = i;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher d(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ boolean e(Object obj) {
        return obj instanceof KeyStoreException;
    }

    @Override // l3.e0
    public c0 a(g3.g gVar) {
        return new c0(gVar, l3.o.f27961a);
    }

    @Override // d8.n
    public void b(l lVar, o oVar, boolean z10) {
        switch (this.f21637r) {
            case k5.f.J:
                lVar.a();
                break;
            default:
                lVar.d();
                break;
        }
    }

    @Override // e2.i
    public double c(double d10) {
        switch (this.f21637r) {
            case 5:
                double d11 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case 6:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            case 7:
                float[] fArr = e2.d.f21852a;
                return e2.d.b(e2.d.f21854c, d10);
            case 8:
                float[] fArr2 = e2.d.f21852a;
                return e2.d.a(e2.d.f21854c, d10);
            case 9:
                float[] fArr3 = e2.d.f21852a;
                return e2.d.d(e2.d.f21855d, d10);
            case 10:
                float[] fArr4 = e2.d.f21852a;
                return e2.d.c(e2.d.f21855d, d10);
            default:
                return d10;
        }
    }

    public Object f(androidx.lifecycle.b bVar) {
        switch (this.f21637r) {
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                return TransportRegistrar.c(bVar);
            case 16:
                return TransportRegistrar.b(bVar);
            default:
                return TransportRegistrar.a(bVar);
        }
    }











}
