package y31;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: /home/user/work/p/classes4.dex */
public class e extends m {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, int i) {
        super(lVar);
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    @Override // y31.m
    public void q() {
        switch (this.e) {
            case 0:
                l lVar = this.b;
                lVar.F = null;
                com.google.android.material.internal.CheckableImageButton r0 = (com.google.android.material.internal.CheckableImageButton) (lVar.x);
                r0.setOnLongClickListener(null);
                sy.n.A((CheckableImageButton) r0, (View.OnLongClickListener) null);
                break;
        }
    }
}
