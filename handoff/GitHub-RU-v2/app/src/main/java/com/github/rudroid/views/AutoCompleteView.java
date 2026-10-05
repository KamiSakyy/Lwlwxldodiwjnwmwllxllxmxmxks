package com.github.rudroid.views;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.QwertyKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.Space;
import androidx.core.widget.NestedScrollView;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.views.AutoCompleteView;
import java.util.LinkedHashSet;
import q.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class AutoCompleteView extends LinearLayout {
    public static final a Companion = new a();
    public final c r;
    public final Space s;
    public ViewGroup t;
    public ViewGroup u;
    public c.a v;
    public int w;

    public static final class a {
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final String r;
        public final Integer s;
        public final Parcelable t;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new b(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, Integer num, Parcelable parcelable) {
            this.r = str;
            this.s = num;
            this.t = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.r, bVar.r) && k71.k.b(this.s, bVar.s) && k71.k.b(this.t, bVar.t);
        }

        public final int hashCode() {
            String str = this.r;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.s;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Parcelable parcelable = this.t;
            return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder r = h1.r(this.s, "EditTextState(editableText=", this.r, ", selectionEnd=", ", baseState=");
            r.append(this.t);
            r.append(")");
            return r.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int intValue;
            k71.k.g(parcel, "dest");
            parcel.writeString(this.r);
            Integer num = this.s;
            if (num == null) {
                intValue = 0;
            } else {
                parcel.writeInt(1);
                intValue = num.intValue();
            }
            parcel.writeInt(intValue);
            parcel.writeParcelable(this.t, i);
        }
    }

    public static final class c extends w {
        public a v;
        public com.github.rudroid.views.a w;
        public int x;

        public interface a {
            void a();

            void b();
        }

        public final a getPopUpWindowListener() {
            return this.v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onSelectionChanged(int i, int i2) {
            com.github.rudroid.views.a aVar;
            super/*android.widget.TextView*/.onSelectionChanged(i, i2);
            Editable text = getText();
            if (text == null || t71.p.T(text) || (aVar = this.w) == null) {
                return;
            }
            Editable text2 = getText();
            k71.k.f(text2, "getText(...)");
            int findTokenStart = aVar.findTokenStart(text2, i2);
            if (findTokenStart < 0 || findTokenStart >= i2) {
                if (isPopupShowing() && isAttachedToWindow()) {
                    dismissDropDown();
                    return;
                }
                return;
            }
            if (this.x != findTokenStart) {
                Editable text3 = getText();
                k71.k.f(text3, "getText(...)");
                int findTokenEnd = aVar.findTokenEnd(text3, i2);
                Editable text4 = getText();
                k71.k.f(text4, "getText(...)");
                performFiltering(text4, findTokenStart, findTokenEnd, 0);
            }
            if (isPopupShowing() || !isAttachedToWindow()) {
                return;
            }
            showDropDown();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void performFiltering(CharSequence charSequence, int i, int i2, int i3) {
            k71.k.g(charSequence, "text");
            com.github.rudroid.views.a aVar = this.w;
            if (aVar != null) {
                if (this.x != i) {
                    com.github.rudroid.autocomplete.b adapter = getAdapter();
                    com.github.rudroid.autocomplete.b bVar = adapter instanceof com.github.rudroid.autocomplete.b ? adapter : null;
                    if (bVar != null) {
                        LinkedHashSet a2 = bVar.a(bVar.x);
                        synchronized (bVar.s) {
                            bVar.w.clear();
                            bVar.w.addAll(a2);
                        }
                        bVar.notifyDataSetChanged();
                    }
                }
                int findTokenEnd = aVar.findTokenEnd(charSequence, i2);
                Filter filter = getFilter();
                if (filter != null) {
                    filter.filter(charSequence.subSequence(i, findTokenEnd), this);
                }
                this.x = i;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void replaceText(CharSequence charSequence) {
            k71.k.g(charSequence, "text");
            clearComposingText();
            com.github.rudroid.views.a aVar = this.w;
            if (aVar != null) {
                Editable text = getText();
                int selectionEnd = getSelectionEnd();
                k71.k.d(text);
                int findTokenEnd = aVar.findTokenEnd(text, selectionEnd);
                int findTokenStart = aVar.findTokenStart(text, selectionEnd);
                QwertyKeyListener.markAsReplaced(text, findTokenStart, findTokenEnd, TextUtils.substring(text, findTokenStart, findTokenEnd));
                boolean z = text.length() > findTokenEnd && text.charAt(findTokenEnd) == ' ';
                CharSequence terminateToken = aVar.terminateToken(charSequence);
                if (z) {
                    findTokenEnd++;
                }
                text.replace(findTokenStart, findTokenEnd, terminateToken);
                setSelection(terminateToken.length() + findTokenStart);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T extends ListAdapter & Filterable> void setAdapter(T t) {
            super/*android.widget.AutoCompleteTextView*/.setAdapter(t);
        }

        public final void setPopUpWindowListener(a aVar) {
            this.v = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void showDropDown() {
            a aVar;
            if (!isPopupShowing() && (aVar = this.v) != null) {
                aVar.b();
            }
            super/*android.widget.AutoCompleteTextView*/.showDropDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.widget.AutoCompleteTextView, android.widget.MultiAutoCompleteTextView, android.widget.TextView, com.github.rudroid.views.AutoCompleteView$c, java.lang.Object, q.w] */
    public AutoCompleteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k71.k.g(context, "context");
        View nestedScrollView = new NestedScrollView(context, (AttributeSet) null);
        final c cVar = new c(context, null);
        cVar.setThreshold(1);
        com.github.rudroid.views.a aVar = new com.github.rudroid.views.a();
        cVar.w = aVar;
        cVar.setTokenizer(aVar);
        final int i = 0;
        cVar.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.github.rudroid.views.c
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                switch (i) {
                    case 0:
                        AutoCompleteView.c.a aVar2 = ((AutoCompleteView.c) cVar).v;
                        if (aVar2 != null) {
                            aVar2.a();
                            break;
                        }
                        break;
                    default:
                        y31.i iVar = (y31.i) cVar;
                        iVar.m = true;
                        iVar.o = SystemClock.uptimeMillis();
                        iVar.s(false);
                        break;
                }
            }
        });
        this.r = cVar;
        Space space = new Space(context);
        this.s = space;
        setOrientation(1);
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        nestedScrollView.setId(View.generateViewId());
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cVar.setMinLines(4);
        cVar.setGravity(48);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165315);
        cVar.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        cVar.setBackgroundColor(0);
        cVar.setInputType(245761);
        cVar.setDropDownAnchor(nestedScrollView.getId());
        cVar.setImeOptions(268435462);
        nestedScrollView.addView((View) cVar);
        addView(nestedScrollView);
        space.setLayoutParams(new LinearLayout.LayoutParams(1, 0, 1.0f));
        space.setVisibility(8);
        addView(space);
        cVar.setPopUpWindowListener(new com.github.rudroid.views.b(this));
    }

    public static final void a(AutoCompleteView autoCompleteView, boolean z) {
        ViewGroup viewGroup = autoCompleteView.t;
        int measuredHeight = viewGroup != null ? viewGroup.getMeasuredHeight() : autoCompleteView.getMeasuredHeight();
        if (measuredHeight <= 0) {
            return;
        }
        ViewGroup viewGroup2 = autoCompleteView.u;
        int measuredHeight2 = viewGroup2 != null ? viewGroup2.getMeasuredHeight() : measuredHeight;
        autoCompleteView.r.setDropDownHeight(measuredHeight2 / 2);
        if (!z) {
            autoCompleteView.getLayoutParams().height = -2;
        } else {
            autoCompleteView.getLayoutParams().height = (measuredHeight2 - (measuredHeight2 - measuredHeight)) - (autoCompleteView.w * 2);
        }
    }

    public final c getAutoCompleteEditText() {
        return this.r;
    }

    public final ViewGroup getDropDownContainer() {
        return this.u;
    }

    public final ViewGroup getEditTextContainer() {
        return this.t;
    }

    public final c.a getPopUpWindowListener() {
        return this.v;
    }

    public final Space getSpace() {
        return this.s;
    }

    public final int getVerticalOffset() {
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.t == null) {
            this.t = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.t = null;
        this.v = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int intValue;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        String str = bVar.r;
        if (str != null) {
            CharSequence newEditable = Editable.Factory.getInstance().newEditable(str);
            w wVar = this.r;
            wVar.setText(newEditable);
            Integer num = bVar.s;
            if (num != null && (intValue = num.intValue()) > 0 && intValue <= str.length()) {
                wVar.setSelection(intValue);
            }
        }
        super.onRestoreInstanceState(bVar.t);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w wVar = this.r;
        return new b(wVar.getText().toString(), Integer.valueOf(wVar.getSelectionEnd()), super.onSaveInstanceState());
    }

    public final void setDropDownContainer(ViewGroup viewGroup) {
        this.u = viewGroup;
    }

    public final void setEditTextContainer(ViewGroup viewGroup) {
        this.t = viewGroup;
    }

    public final void setPopUpWindowListener(c.a aVar) {
        this.v = aVar;
    }

    public final void setVerticalOffset(int i) {
        this.w = i;
    }

}
