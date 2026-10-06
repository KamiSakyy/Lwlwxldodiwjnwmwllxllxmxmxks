package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import b5.e;
import i31.g;
import i31.h;
import i31.j;
import i31.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o31.a;
import o31.f;
import o31.i;
import o31.o;

/* loaded from: /home/user/work/p/classes4.dex */
public class ChipGroup extends f {
    public final k A;
    public int v;
    public int w;
    public j x;
    public final a y;
    public final int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(r10, attributeSet, 2130968791);
        Context a = a41.a.a(context, attributeSet, 2130968791, 2132018474);
        this.t = false;
        TypedArray obtainStyledAttributes = a.getTheme().obtainStyledAttributes(attributeSet, x21.a.n, 0, 0);
        this.r = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        a aVar = new a();
        this.y = aVar;
        k kVar = new k(this);
        this.A = kVar;
        TypedArray f = o.f(getContext(), attributeSet, x21.a.g, 2130968791, 2132018474, new int[0]);
        int dimensionPixelOffset = f.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(f.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(f.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(f.getBoolean(5, false));
        setSingleSelection(f.getBoolean(6, false));
        setSelectionRequired(f.getBoolean(4, false));
        this.z = f.getResourceId(0, -1);
        f.recycle();
        aVar.e = new g(this);
        super.setOnHierarchyChangeListener(kVar);
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof h);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new h(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new h(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.y.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.y.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.v;
    }

    public int getChipSpacingVertical() {
        return this.w;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.z;
        if (i != -1) {
            a aVar = this.y;
            i iVar = (i) ((HashMap) aVar.c).get(Integer.valueOf(i));
            if (iVar != null && aVar.a(iVar)) {
                aVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e.c(getRowCount(), this.t ? getVisibleChipCount() : -1, this.y.a ? 1 : 2, false).b);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.v != i) {
            this.v = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.w != i) {
            this.w = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(i31.i iVar) {
        if (iVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new g(this));
        }
    }

    public void setOnCheckedStateChangeListener(j jVar) {
        this.x = jVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A.r = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.y.b = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // o31.f
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        a aVar = this.y;
        if (aVar.a != z) {
            aVar.a = z;
            boolean isEmpty = ((HashSet) aVar.d).isEmpty();
            Iterator it = ((HashMap) aVar.c).values().iterator();
            while (it.hasNext()) {
                aVar.e((i) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            aVar.d();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new h(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
