package e31;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.internal.x3;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import d1.j1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import o31.o;
import org.xmlpull.v1.XmlPullParserException;
import u31.a0;
import u31.b0;
import u31.c0;
import u31.n;
import u31.z;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d extends LinearLayout {
    public boolean A;
    public final ArrayList r;
    public final ArrayList s;
    public final x3 t;
    public final j1 u;
    public Integer[] v;
    public z w;
    public a0 x;
    public int y;
    public c0 z;

    public d(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130969451, 2132018348), attributeSet, 2130969451);
        z b;
        XmlResourceParser xml;
        int next;
        c0 c0Var;
        AttributeSet asAttributeSet;
        int next2;
        this.r = new ArrayList();
        this.s = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.t = new x3(8, materialButtonToggleGroup);
        this.u = new j1(2, materialButtonToggleGroup);
        this.A = true;
        Context context2 = getContext();
        TypedArray f = o.f(context2, attributeSet, x21.a.r, 2130969451, 2132018348, new int[0]);
        if (f.hasValue(2)) {
            int resourceId = f.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        c0Var = new c0();
                        c0Var.c = new int[10][];
                        c0Var.d = new s21.a[10];
                        asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    c0Var.a(context2, xml, asAttributeSet, context2.getTheme());
                }
                xml.close();
                this.z = c0Var;
            }
            c0Var = null;
            this.z = c0Var;
        }
        if (f.hasValue(4)) {
            a0 b2 = a0.b(context2, f, 4);
            this.x = b2;
            if (b2 == null) {
                l7.e eVar = new l7.e(n.a(f.getResourceId(4, 0), f.getResourceId(5, 0), context2).a());
                this.x = eVar.b != 0 ? new a0(eVar) : null;
            }
        }
        if (f.hasValue(3)) {
            u31.a aVar = new u31.a(0.0f);
            int resourceId2 = f.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b = z.b(n.d(f, 3, aVar));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        b = new z();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            b.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b = z.b(aVar);
                }
            } else {
                b = z.b(n.d(f, 3, aVar));
            }
            this.w = b;
        }
        this.y = f.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f.getBoolean(0, true));
        f.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final void a() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            ?? r3 = (MaterialButton) getChildAt(i2);
            MaterialButton materialButton = (MaterialButton) getChildAt(i2 - 1);
            if (this.y <= 0) {
                i = Math.min(r3.getStrokeWidth(), materialButton.getStrokeWidth());
                r3.setShouldDrawSurfaceColorStroke(true);
                materialButton.setShouldDrawSurfaceColorStroke(true);
            } else {
                r3.setShouldDrawSurfaceColorStroke(false);
                materialButton.setShouldDrawSurfaceColorStroke(false);
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams = r3.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.y - i);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.y - i;
                layoutParams2.setMarginStart(0);
            }
            r3.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            d();
            this.A = true;
            super.addView(view, i, layoutParams);
            ?? r2 = (MaterialButton) view;
            setGeneratedIdIfNeeded(r2);
            r2.setOnPressedChangeListenerInternal(this.t);
            this.r.add(r2.getShapeAppearanceModel());
            this.s.add(r2.getStateListShapeAppearanceModel());
            r2.setEnabled(isEnabled());
        }
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float max;
        if (this.z == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i = Integer.MAX_VALUE;
        for (int i2 = firstVisibleChildIndex; i2 <= lastVisibleChildIndex; i2++) {
            if (c(i2)) {
                if (c(i2) && this.z != null) {
                    q.o oVar = (MaterialButton) getChildAt(i2);
                    c0 c0Var = this.z;
                    int width = oVar.getWidth();
                    int i3 = -width;
                    for (int i4 = 0; i4 < c0Var.a; i4++) {
                        b0 b0Var = (b0) c0Var.d[i4].s;
                        int i5 = b0Var.a;
                        float f = b0Var.b;
                        if (i5 == 2) {
                            max = Math.max(i3, f);
                        } else if (i5 == 1) {
                            max = Math.max(i3, width * f);
                        }
                        i3 = (int) max;
                    }
                    int max2 = Math.max(0, i3);
                    int i6 = i2 - 1;
                    while (true) {
                        materialButton = null;
                        if (i6 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i6)) {
                                materialButton2 = (MaterialButton) getChildAt(i6);
                                break;
                            }
                            i6--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i7 = i2 + 1;
                    while (true) {
                        if (i7 >= childCount) {
                            break;
                        }
                        if (c(i7)) {
                            materialButton = (MaterialButton) getChildAt(i7);
                            break;
                        }
                        i7++;
                    }
                    r5 = Math.min(max2, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i2 != firstVisibleChildIndex && i2 != lastVisibleChildIndex) {
                    r5 /= 2;
                }
                i = Math.min(i, r5);
            }
        }
        int i8 = firstVisibleChildIndex;
        while (i8 <= lastVisibleChildIndex) {
            if (c(i8)) {
                ((MaterialButton) getChildAt(i8)).setSizeChange(this.z);
                ((MaterialButton) getChildAt(i8)).setWidthChangeMax((i8 == firstVisibleChildIndex || i8 == lastVisibleChildIndex) ? i : i * 2);
            }
            i8++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            ?? r1 = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = r1.M;
            if (layoutParams != null) {
                r1.setLayoutParams(layoutParams);
                r1.M = null;
                r1.J = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap((Comparator) this.u);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.v = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final void e() {
        l7.e eVar;
        int i;
        if (!(this.w == null && this.x == null) && this.A) {
            this.A = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                ?? r6 = (MaterialButton) getChildAt(i2);
                if (r6.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    a0 a0Var = this.x;
                    if (a0Var == null || (!z && !z2)) {
                        a0Var = (a0) this.s.get(i2);
                    }
                    if (a0Var == null) {
                        eVar = new l7.e((n) this.r.get(i2));
                    } else {
                        l7.e eVar2 = new l7.e(2);
                        int i3 = a0Var.a;
                        eVar2.b = i3;
                        eVar2.e = a0Var.b;
                        int[][] iArr = a0Var.c;
                        int[][] iArr2 = new int[iArr.length][];
                        eVar2.f = iArr2;
                        n[] nVarArr = a0Var.d;
                        eVar2.c = new n[nVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i3);
                        System.arraycopy(nVarArr, 0, (n[]) eVar2.c, 0, eVar2.b);
                        eVar2.d = a0Var.e;
                        eVar2.g = a0Var.f;
                        eVar2.h = a0Var.g;
                        eVar2.i = a0Var.h;
                        eVar = eVar2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    z zVar = this.w;
                    if ((i4 | 1) == i4) {
                        eVar.d = zVar;
                    }
                    if ((i4 | 2) == i4) {
                        eVar.g = zVar;
                    }
                    if ((i4 | 4) == i4) {
                        eVar.h = zVar;
                    }
                    if ((i4 | 8) == i4) {
                        eVar.i = zVar;
                    }
                    a0 a0Var2 = eVar.b == 0 ? null : new a0(eVar);
                    if (a0Var2.d()) {
                        r6.setStateListShapeAppearanceModel(a0Var2);
                    } else {
                        r6.setShapeAppearanceModel(a0Var2.c());
                    }
                }
                i2++;
            }
        }
    }

    public c0 getButtonSizeChange() {
        return this.z;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.v;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public u31.d getInnerCornerSize() {
        return this.w.b;
    }

    public z getInnerCornerSizeStateList() {
        return this.w;
    }

    public n getShapeAppearance() {
        a0 a0Var = this.x;
        if (a0Var == null) {
            return null;
        }
        return a0Var.c();
    }

    public int getSpacing() {
        return this.y;
    }

    public a0 getStateListShapeAppearance() {
        return this.x;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.r.remove(indexOfChild);
            this.s.remove(indexOfChild);
        }
        this.A = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(c0 c0Var) {
        if (this.z != c0Var) {
            this.z = c0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(u31.d dVar) {
        this.w = z.b(dVar);
        this.A = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z zVar) {
        this.w = zVar;
        this.A = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.A = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(n nVar) {
        l7.e eVar = new l7.e(nVar);
        this.x = eVar.b == 0 ? null : new a0(eVar);
        this.A = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.y = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(a0 a0Var) {
        this.x = a0Var;
        this.A = true;
        e();
        invalidate();
    }
}
