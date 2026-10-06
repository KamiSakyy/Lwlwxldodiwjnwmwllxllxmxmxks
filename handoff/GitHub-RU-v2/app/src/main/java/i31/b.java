package i31;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.material.chip.Chip;
import o31.l;
import o31.m;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void m0(int i) {
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void S(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                m mVar = (m) this.b;
                mVar.e = true;
                l lVar = (l) mVar.f.get();
                if (lVar != null) {
                    lVar.a();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, android.widget.TextView, com.google.android.material.chip.Chip] */
    @Override // com.google.android.gms.internal.measurement.d5
    public final void T(Typeface typeface, boolean z) {
        switch (this.a) {
            case 0:
                com.google.android.material.chip.Chip r2 = (com.google.android.material.chip.Chip) ((Chip) this.b);
                f fVar = r2.v;
                r2.setText(fVar.d1 ? fVar.f0 : r2.getText());
                r2.requestLayout();
                r2.invalidate();
                break;
            default:
                if (!z) {
                    m mVar = (m) this.b;
                    mVar.e = true;
                    l lVar = (l) mVar.f.get();
                    if (lVar != null) {
                        lVar.a();
                        break;
                    }
                }
                break;
        }
    }
    public static final Object e = null;
}
