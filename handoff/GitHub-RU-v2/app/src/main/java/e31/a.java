package e31;

import com.google.android.material.button.MaterialButton;
import sy.q;
import u31.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends q {
    public final float h(y yVar) {
        float displayedWidthIncrease;
        displayedWidthIncrease = ((MaterialButton) yVar).getDisplayedWidthIncrease();
        return displayedWidthIncrease;
    }

    public final void k(y yVar, float f) {
        ((MaterialButton) yVar).setDisplayedWidthIncrease(f);
    }
}
