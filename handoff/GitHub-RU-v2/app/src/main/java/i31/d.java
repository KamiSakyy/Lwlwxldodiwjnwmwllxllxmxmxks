package i31;

import android.R;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends j5.b {
    public final /* synthetic */ Chip H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.H = chip;
    }

    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.O;
        Chip chip = this.H;
        if (!chip.c() || (fVar = chip.v) == null || !fVar.l0 || chip.y == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View, android.widget.TextView, com.google.android.material.chip.Chip] */
    public final void o(int i, b5.f fVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.O);
            return;
        }
        Chip r6 = this.H;
        CharSequence closeIconContentDescription = r6.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = r6.getText();
            accessibilityNodeInfo.setContentDescription(r6.getContext().getString(2131953262, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = r6.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        fVar.b(b5.b.e);
        accessibilityNodeInfo.setEnabled(r6.isEnabled());
        fVar.j(Button.class.getName());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.google.android.material.chip.Chip] */
    public final void p(int i, boolean z) {
        Chip r0 = this.H;
        if (i == 1) {
            r0.E = z;
        }
        f fVar = r0.v;
        boolean z2 = r0.E;
        boolean z3 = false;
        if (fVar.m0 != null) {
            z3 = fVar.W(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f.g1);
        }
        if (z3) {
            r0.refreshDrawableState();
        }
    }
}
