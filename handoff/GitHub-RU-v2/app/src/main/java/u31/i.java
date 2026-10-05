package u31;

import com.google.android.material.button.MaterialButton;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends sy.q {
    public final int a;

    public i(int i) {
        this.a = i;
    }

    public final float h(y yVar) {
        float[] fArr = ((j) yVar).T;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final void k(y yVar, float f) {
        j jVar = (j) yVar;
        float[] fArr = jVar.T;
        if (fArr != null) {
            int i = this.a;
            if (fArr[i] != f) {
                fArr[i] = f;
                c5.b bVar = jVar.V;
                if (bVar != null) {
                    float i2 = jVar.i();
                    com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) ((MaterialButton) bVar.s);
                    int i3 = (int) (i2 * 0.11f);
                    if (r5.O != i3) {
                        r5.O = i3;
                        r5.j();
                        r5.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }
}
