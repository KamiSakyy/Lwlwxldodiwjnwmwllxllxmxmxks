package q;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.internal.measurement.a4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class t2 extends g5.a implements View.OnClickListener {
    public static final /* synthetic */ int O = 0;
    public final LayoutInflater A;
    public final SearchView B;
    public final SearchableInfo C;
    public final Context D;
    public final WeakHashMap E;
    public final int F;
    public int G;
    public ColorStateList H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;

    /* renamed from: y, reason: collision with root package name */
    public final int f30732y;

    /* renamed from: z, reason: collision with root package name */
    public final int f30733z;

    public t2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f24770s = true;
        this.f24771t = null;
        this.f24769r = false;
        this.f24772u = -1;
        this.f24773v = new a4(this);
        this.f24774w = new androidx.viewpager.widget.h(1, this);
        this.f30733z = suggestionRowLayout;
        this.f30732y = suggestionRowLayout;
        this.A = (LayoutInflater) context.getSystemService("layout_inflater");
        this.G = 1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.B = searchView;
        this.C = searchableInfo;
        this.F = searchView.getSuggestionCommitIconResId();
        this.D = context;
        this.E = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    @Override // g5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i;
        int i10;
        Drawable f6;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        s2 s2Var = (s2) view.getTag();
        int i11 = this.N;
        int i12 = i11 != -1 ? cursor.getInt(i11) : 0;
        TextView textView = s2Var.f30715a;
        TextView textView2 = s2Var.f30716b;
        ImageView imageView = s2Var.f30719e;
        if (textView != null) {
            String h10 = h(cursor, this.I);
            textView.setText(h10);
            if (TextUtils.isEmpty(h10)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.D;
        if (textView2 != null) {
            String h11 = h(cursor, this.K);
            if (h11 != null) {
                if (this.H == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(2130969949, typedValue, true);
                    this.H = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h11);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.H, null), 0, h11.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.J);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = s2Var.f30717c;
        if (imageView2 != null) {
            int i13 = this.L;
            if (i13 == -1) {
                f6 = null;
            } else {
                f6 = f(cursor.getString(i13));
                if (f6 == null) {
                    ComponentName searchActivity = this.C.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.E;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f6 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e5) {
                            e5.toString();
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                searchActivity.flattenToShortString();
                            } else {
                                f6 = drawable;
                                weakHashMap.put(flattenToShortString, f6 != null ? null : f6.getConstantState());
                            }
                        }
                        f6 = null;
                        weakHashMap.put(flattenToShortString, f6 != null ? null : f6.getConstantState());
                    }
                    if (f6 == null) {
                        f6 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f6);
            if (f6 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f6.setVisible(false, false);
                f6.setVisible(true, false);
            }
        }
        ImageView imageView3 = s2Var.f30718d;
        if (imageView3 != null) {
            int i14 = this.M;
            Drawable f10 = i14 == -1 ? null : f(cursor.getString(i14));
            imageView3.setImageDrawable(f10);
            if (f10 != null) {
                imageView3.setVisibility(0);
                f10.setVisible(false, false);
                i = 1;
                f10.setVisible(true, false);
                i10 = this.G;
                if (i10 == 2 && (i10 != i || (i12 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i = 1;
        i10 = this.G;
        if (i10 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // g5.a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.I = cursor.getColumnIndex("suggest_text_1");
                this.J = cursor.getColumnIndex("suggest_text_2");
                this.K = cursor.getColumnIndex("suggest_text_2_url");
                this.L = cursor.getColumnIndex("suggest_icon_1");
                this.M = cursor.getColumnIndex("suggest_icon_2");
                this.N = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // g5.a
    public final String c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        SearchableInfo searchableInfo = this.C;
        if (searchableInfo.shouldRewriteQueryFromData() && (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h10;
    }

    @Override // g5.a
    public final View d(ViewGroup viewGroup) {
        View inflate = this.A.inflate(this.f30732y, viewGroup, false);
        inflate.setTag(new s2(inflate));
        ((ImageView) inflate.findViewById(2131362285)).setImageResource(this.F);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.D.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.E;
        Context context = this.D;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e5) {
                    Objects.toString(parse);
                    e5.getMessage();
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                            weakHashMap.put(str, drawable.getConstantState());
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        drawable = Drawable.createFromStream(openInputStream, null);
                        if (drawable != null) {
                        }
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException unused4) {
                            parse.toString();
                        }
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.D.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // g5.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e5) {
            View inflate = this.A.inflate(this.f30733z, viewGroup, false);
            if (inflate != null) {
                ((s2) inflate.getTag()).f30715a.setText(e5.toString());
            }
            return inflate;
        }
    }

    @Override // g5.a, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e5) {
            View d10 = d(viewGroup);
            ((s2) d10.getTag()).f30715a.setText(e5.toString());
            return d10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f24771t;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f24771t;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.B.p((CharSequence) tag);
        }
    }
}
