package i31;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener r;
    public final /* synthetic */ ChipGroup s;

    public k(ChipGroup chipGroup) {
        this.s = chipGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.s;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            o31.a aVar = chipGroup.y;
            Chip chip = (Chip) view2;
            ((HashMap) aVar.c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                aVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new kk.a(15, aVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.r;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.s;
        if (view == chipGroup && (view2 instanceof Chip)) {
            o31.a aVar = chipGroup.y;
            Chip chip = (Chip) view2;
            aVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) aVar.c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) aVar.d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.r;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
