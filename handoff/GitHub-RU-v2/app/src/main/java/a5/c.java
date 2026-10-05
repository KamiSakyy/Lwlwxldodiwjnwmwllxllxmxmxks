package a5;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* loaded from: /home/user/work/p/classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ Font.Builder a(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder b(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }
}
