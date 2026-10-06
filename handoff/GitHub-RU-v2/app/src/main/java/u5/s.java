package u5;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public class s extends SpannableStringBuilder {

    /* renamed from: r, reason: collision with root package name */
    public Class f32244r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f32245s;

    public s(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f32245s = new ArrayList();
        sy.pShadow.i(cls, "watcherClass cannot be null");
        this.f32244r = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f32245s;
            if (i >= arrayList.size()) {
                return;
            }
            ((r) arrayList.get(i)).f32243s.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f32245s;
            if (i >= arrayList.size()) {
                return;
            }
            ((r) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final r c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f32245s;
            if (i >= arrayList.size()) {
                return null;
            }
            r rVar = (r) arrayList.get(i);
            if (rVar.f32242r == obj) {
                return rVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f32244r == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i10) {
        super.delete(i, i10);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f32245s;
            if (i >= arrayList.size()) {
                return;
            }
            ((r) arrayList.get(i)).f32243s.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        r c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        r c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        r c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i10, Class cls) {
        if (this.f32244r != cls) {
            return super.getSpans(i, i10, cls);
        }
        r[] rVarArr = (r[]) super.getSpans(i, i10, r.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, rVarArr.length);
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            objArr[i11] = rVarArr[i11].f32242r;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i10, Class cls) {
        if (cls == null || this.f32244r == cls) {
            cls = r.class;
        }
        return super.nextSpanTransition(i, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        r rVar;
        if (d(obj)) {
            rVar = c(obj);
            if (rVar != null) {
                obj = rVar;
            }
        } else {
            rVar = null;
        }
        super.removeSpan(obj);
        if (rVar != null) {
            this.f32245s.remove(rVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i10, CharSequence charSequence) {
        replace(i, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        if (d(obj)) {
            r rVar = new r(obj);
            this.f32245s.add(rVar);
            obj = rVar;
        }
        super.setSpan(obj, i, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return new s(this.f32244r, this, i, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append_dup(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete_dup(int i, int i10) {
        super.delete(i, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert_dup(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append_dup_dup(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i10, int i11) {
        super.insert(i, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace_dup(int i, int i10, CharSequence charSequence) {
        a();
        super.replace(i, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert_dup(int i, CharSequence charSequence, int i10, int i11) {
        super.insert(i, charSequence, i10, i11);
        return this;
    }

    public s(Class cls, s sVar, int i, int i10) {
        super(sVar, i, i10);
        this.f32245s = new ArrayList();
        sy.pShadow.i(cls, "watcherClass cannot be null");
        this.f32244r = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append_dup(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append_dup_dup(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace_dup(int i, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i10) {
        super.append(charSequence, i, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append_dup(CharSequence charSequence, int i, int i10) {
        super.append(charSequence, i, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append_dup_dup(CharSequence charSequence, int i, int i10) {
        super.append(charSequence, i, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
