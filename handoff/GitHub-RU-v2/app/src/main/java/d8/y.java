package d8;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class y extends x {
    @Override // y9.a
    public final void A(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // d8.x, y9.a
    public final void B(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // d8.x
    public final void R(View view, int i, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i, i10, i11, i12);
    }

    @Override // d8.x
    public final void S(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // d8.x
    public final void T(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // y9.a
    public final float s(View view) {
        return view.getTransitionAlpha();
    }
}
