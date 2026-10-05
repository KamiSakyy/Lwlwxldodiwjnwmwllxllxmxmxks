package rc;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {
    public static final SearchView a(MenuItem menuItem, String str, j71.c cVar, j71.c cVar2) {
        k71.k.g(menuItem, "<this>");
        View actionView = menuItem.getActionView();
        SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
        if (searchView == null) {
            return null;
        }
        searchView.setQueryHint(str);
        searchView.setOnQueryTextListener(new f(cVar, cVar2, searchView));
        return searchView;
    }

    public static final void b(MenuItem menuItem, Context context, int i, int i10) {
        int color = context.getColor(i);
        menuItem.setIcon(context.getDrawable(i10));
        Drawable icon = menuItem.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
    }

    public static final void c(MenuItem menuItem, Context context, int i) {
        k71.k.g(menuItem, "<this>");
        SpannableString spannableString = new SpannableString(menuItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i)), 0, spannableString.length(), 0);
        menuItem.setTitle(spannableString);
    }
}
