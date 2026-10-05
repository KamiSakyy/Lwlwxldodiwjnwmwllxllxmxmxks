package com.google.android.material.button;

import a41.a;
import a5.c1;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.viewpager.widget.f;
import b5.e;
import com.google.android.material.timepicker.i;
import e31.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o31.o;
import u31.z;

/* loaded from: /home/user/work/p/classes4.dex */
public class MaterialButtonToggleGroup extends d {
    public static final /* synthetic */ int H = 0;
    public final LinkedHashSet B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final int F;
    public HashSet G;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969451, 2132018488), attributeSet);
        this.B = new LinkedHashSet();
        this.C = false;
        this.G = new HashSet();
        TypedArray f = o.f(getContext(), attributeSet, x21.a.s, 2130969451, 2132018488, new int[0]);
        setSingleSelection(f.getBoolean(7, false));
        this.F = f.getResourceId(2, -1);
        this.E = f.getBoolean(4, false);
        if (this.w == null) {
            this.w = z.b(new u31.a(0.0f));
        }
        setEnabled(f.getBoolean(0, true));
        f.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.D ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    @Override // e31.d, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            ?? r2 = (MaterialButton) view;
            setupButtonChild(r2);
            f(r2.getId(), r2.F);
            c1.p((View) r2, new f(3, this));
        }
    }

    public final void f(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.G);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.D && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.E || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.G;
        this.G = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            Object findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.C = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.C = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.D || this.G.isEmpty()) {
            return -1;
        }
        return ((Integer) this.G.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.G.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.F;
        if (i != -1) {
            g(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e.c(1, getVisibleButtonCount(), this.D ? 1 : 2, false).b);
    }

    public void setSelectionRequired(boolean z) {
        this.E = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.D != z) {
            this.D = z;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
