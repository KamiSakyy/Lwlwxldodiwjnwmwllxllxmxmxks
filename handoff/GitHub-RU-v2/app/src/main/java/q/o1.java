package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/user/work/p/classes.dex */
public class o1 extends ListView {
    public boolean A;
    public f5.d B;
    public androidx.fragment.app.o C;

    /* renamed from: r, reason: collision with root package name */
    public Rect f30673r;

    /* renamed from: s, reason: collision with root package name */
    public int f30674s;

    /* renamed from: t, reason: collision with root package name */
    public int f30675t;

    /* renamed from: u, reason: collision with root package name */
    public int f30676u;

    /* renamed from: v, reason: collision with root package name */
    public int f30677v;

    /* renamed from: w, reason: collision with root package name */
    public int f30678w;

    /* renamed from: x, reason: collision with root package name */
    public m1 f30679x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30680y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30681z;

    public o1(Context context, boolean z10) {
        super(context, null, 2130969049);
        this.f30673r = new Rect();
        this.f30674s = 0;
        this.f30675t = 0;
        this.f30676u = 0;
        this.f30677v = 0;
        this.f30681z = z10;
        setCacheColorHint(0);
    }

    public final int a(int i, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z10;
        boolean z11;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = false;
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    if (z10 || z12) {
                        this.A = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f30678w - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z10) {
                        f5.d dVar = this.B;
                        if (dVar != null) {
                            if (dVar.G) {
                                dVar.d();
                            }
                            dVar.G = false;
                        }
                    } else {
                        if (this.B == null) {
                            this.B = new f5.d(this);
                        }
                        f5.d dVar2 = this.B;
                        boolean z13 = dVar2.G;
                        dVar2.G = true;
                        dVar2.onTouch(this, motionEvent);
                    }
                    return z10;
                }
                z10 = false;
                if (z10) {
                }
                this.A = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f30678w - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z10) {
                }
                return z10;
            }
            z10 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition == -1) {
                z12 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f6 = x2;
                float f10 = y2;
                this.A = true;
                int i10 = Build.VERSION.SDK_INT;
                j1.a(this, f6, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f30678w;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f30678w = pointToPosition;
                j1.a(childAt3, f6 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z14 = (selector == null || pointToPosition == -1) ? false : true;
                if (z14) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f30673r;
                rect.set(left, top, right, bottom);
                rect.left -= this.f30674s;
                rect.top -= this.f30675t;
                rect.right += this.f30676u;
                rect.bottom += this.f30677v;
                if (i10 >= 33) {
                    z11 = l1.a(this);
                } else {
                    Field field = n1.f30666a;
                    if (field != null) {
                        try {
                            z11 = field.getBoolean(this);
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                        }
                    }
                    z11 = false;
                }
                if (childAt3.isEnabled() != z11) {
                    boolean z15 = !z11;
                    if (Build.VERSION.SDK_INT >= 33) {
                        l1.b(this, z15);
                    } else {
                        Field field2 = n1.f30666a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z15));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z14) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f6, f10);
                }
                m1 m1Var = this.f30679x;
                if (m1Var != null) {
                    m1Var.f30651s = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z10 = true;
                z12 = false;
            }
            if (z10) {
            }
            this.A = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f30678w - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z10) {
            }
            return z10;
        }
        z10 = false;
        if (z10) {
        }
        this.A = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f30678w - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z10) {
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f30673r;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.C != null) {
            return;
        }
        super.drawableStateChanged();
        m1 m1Var = this.f30679x;
        if (m1Var != null) {
            m1Var.f30651s = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.A && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f30681z || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f30681z || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f30681z || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f30681z && this.f30680y) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.C == null) {
            androidx.fragment.app.o oVar = new androidx.fragment.app.o(27, this);
            this.C = oVar;
            post(oVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !k1.f30638d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        k1.f30635a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        k1.f30636b.invoke(this, Integer.valueOf(pointToPosition));
                        k1.f30637c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.A && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f30678w = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.fragment.app.o oVar = this.C;
        if (oVar != null) {
            o1 o1Var = (o1) oVar.f2617s;
            o1Var.C = null;
            o1Var.removeCallbacks(oVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f30680y = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        m1 m1Var;
        if (drawable != null) {
            m1Var = new m1();
            Drawable drawable2 = m1Var.f30650r;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            m1Var.f30650r = drawable;
            if (drawable != null) {
                drawable.setCallback(m1Var);
            }
            m1Var.f30651s = true;
        } else {
            m1Var = null;
        }
        this.f30679x = m1Var;
        super.setSelector(m1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f30674s = rect.left;
        this.f30675t = rect.top;
        this.f30676u = rect.right;
        this.f30677v = rect.bottom;
    }
}
