package x31;

import a5.c1;
import a5.v0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import o31.o;
import q.j3;
import w8.s;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends LinearLayout {
    public static final /* synthetic */ int C = 0;
    public int A;
    public final /* synthetic */ TabLayout B;
    public g r;
    public TextView s;
    public ImageView t;
    public View u;
    public a31.a v;
    public View w;
    public TextView x;
    public ImageView y;
    public Drawable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabLayout tabLayout, Context context) {
        super(context);
        this.B = tabLayout;
        this.A = 2;
        e(context);
        setPaddingRelative(tabLayout.v, tabLayout.w, tabLayout.x, tabLayout.y);
        setGravity(17);
        setOrientation(!tabLayout.U ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        WeakHashMap weakHashMap = c1.a;
        v0.a(this, systemIcon);
    }

    private a31.a getBadge() {
        return this.v;
    }

    private a31.a getOrCreateBadge() {
        if (this.v == null) {
            this.v = new a31.a(getContext());
        }
        b();
        a31.a aVar = this.v;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.v != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.u;
            if (view != null) {
                a31.a aVar = this.v;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.u = null;
            }
        }
    }

    public final void b() {
        if (this.v != null) {
            if (this.w != null) {
                a();
                return;
            }
            TextView textView = this.s;
            if (textView == null || this.r == null) {
                a();
                return;
            }
            if (this.u == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.s;
            if (this.v == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            a31.a aVar = this.v;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(textView2, null);
            if (aVar.d() != null) {
                aVar.d().setForeground(aVar);
            } else {
                textView2.getOverlay().add(aVar);
            }
            this.u = textView2;
        }
    }

    public final void c(View view) {
        a31.a aVar = this.v;
        if (aVar == null || view != this.u) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.i(view, null);
    }

    public final void d() {
        boolean z;
        f();
        g gVar = this.r;
        if (gVar != null) {
            TabLayout tabLayout = gVar.e;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == gVar.c) {
                z = true;
                setSelected(z);
            }
        }
        z = false;
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.z;
        if ((drawable == null || !drawable.isStateful()) ? false : this.z.setState(drawableState)) {
            invalidate();
            this.B.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, x31.j] */
    public final void e(Context context) {
        TabLayout tabLayout = this.B;
        int i = tabLayout.K;
        if (i != 0) {
            Drawable o = s.o(context, i);
            this.z = o;
            if (o != null && o.isStateful()) {
                this.z.setState(getDrawableState());
            }
        } else {
            this.z = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.E != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.E;
            int a = s31.a.a(colorStateList, s31.a.c);
            int[] iArr = s31.a.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{s31.a.d, iArr, StateSet.NOTHING}, new int[]{a, s31.a.a(colorStateList, iArr), s31.a.a(colorStateList, s31.a.a)});
            boolean z = tabLayout.b0;
            if (z) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable2);
        }
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i;
        ViewParent parent;
        g gVar = this.r;
        View view = gVar != null ? gVar.d : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.w;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.w);
                }
                addView(view);
            }
            this.w = view;
            TextView textView = this.s;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.t;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.t.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.x = textView2;
            if (textView2 != null) {
                this.A = textView2.getMaxLines();
            }
            this.y = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.w;
            if (view3 != null) {
                removeView(view3);
                this.w = null;
            }
            this.x = null;
            this.y = null;
        }
        if (this.w == null) {
            if (this.t == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(2131558764, (ViewGroup) this, false);
                this.t = imageView2;
                addView(imageView2, 0);
            }
            if (this.s == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(2131558765, (ViewGroup) this, false);
                this.s = textView3;
                addView(textView3);
                this.A = this.s.getMaxLines();
            }
            TextView textView4 = this.s;
            TabLayout tabLayout = this.B;
            textView4.setTextAppearance(tabLayout.z);
            if (!isSelected() || (i = tabLayout.B) == -1) {
                this.s.setTextAppearance(tabLayout.A);
            } else {
                this.s.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.C;
            if (colorStateList != null) {
                this.s.setTextColor(colorStateList);
            }
            g(this.s, this.t, true);
            b();
            ImageView imageView3 = this.t;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new i(this, imageView3));
            }
            TextView textView5 = this.s;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new i(this, textView5));
            }
        } else {
            TextView textView6 = this.x;
            if (textView6 != null || this.y != null) {
                g(textView6, this.y, false);
            }
        }
        if (gVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        g gVar = this.r;
        CharSequence charSequence = gVar != null ? gVar.b : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (isEmpty) {
                z2 = false;
            } else {
                this.r.getClass();
                z2 = true;
            }
            textView.setText(!isEmpty ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int d = (z2 && imageView.getVisibility() == 0) ? (int) o.d(getContext(), 8) : 0;
            if (this.B.U) {
                if (d != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(d);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (d != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = d;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        j3.a(this, isEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.s, this.t, this.w};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        View[] viewArr = {this.s, this.t, this.w};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                i = z ? Math.max(i, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return i - i2;
    }

    public g getTab() {
        return this.r;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a31.a aVar = this.v;
        if (aVar != null && aVar.isVisible()) {
            a31.a aVar2 = this.v;
            a31.c cVar = aVar2.v;
            CharSequence charSequence = null;
            if (aVar2.isVisible()) {
                a31.b bVar = cVar.b;
                if (bVar.A != null) {
                    charSequence = bVar.F;
                    if (charSequence == null) {
                        charSequence = aVar2.v.b.A;
                    }
                } else if (!aVar2.g()) {
                    charSequence = bVar.G;
                } else if (bVar.H != 0 && (context = (Context) aVar2.r.get()) != null) {
                    if (aVar2.y != -2) {
                        int e = aVar2.e();
                        int i = aVar2.y;
                        if (e > i) {
                            charSequence = context.getString(bVar.I, Integer.valueOf(i));
                        }
                    }
                    charSequence = context.getResources().getQuantityString(bVar.H, aVar2.e(), Integer.valueOf(aVar2.e()));
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b5.e.b(0, 1, this.r.c, 1, false, isSelected()).b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) b5.b.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(2131952983));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.B;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.L, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.s != null) {
            float f = tabLayout.H;
            if (isSelected() && tabLayout.B != -1) {
                f = tabLayout.I;
            }
            int i3 = this.A;
            ImageView imageView = this.t;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.s;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.J;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.s.getTextSize();
            int lineCount = this.s.getLineCount();
            int maxLines = this.s.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.T == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.s.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.s.setTextSize(0, f);
                this.s.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.r == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.r.a();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.s;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.w;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(g gVar) {
        if (gVar != this.r) {
            this.r = gVar;
            d();
        }
    }
}
