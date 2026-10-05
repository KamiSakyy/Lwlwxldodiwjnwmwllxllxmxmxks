package com.github.rudroid.shortcuts.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.github.service.models.response.shortcuts.ShortcutScope;

/* loaded from: /home/user/work/p/classes3.dex */
final class a extends com.github.rudroid.activities.util.e<w61.a0, ShortcutScope.SpecificRepository> {
    public final Intent R(Context context, Object obj) {
        k71.k.g((w61.a0) obj, "input");
        ChooseShortcutRepositoryActivity.Companion.getClass();
        return new Intent(context, (Class<?>) ChooseShortcutRepositoryActivity.class);
    }

    public final Object y(Intent intent, int i) {
        Parcelable parcelable;
        if (intent == null || i != -1) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = (Parcelable) intent.getParcelableExtra("CHOOSE_SHORTCUT_REPOSITORY_RESULT_KEY", ShortcutScope.SpecificRepository.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("CHOOSE_SHORTCUT_REPOSITORY_RESULT_KEY");
            parcelable = (ShortcutScope.SpecificRepository) (parcelableExtra instanceof ShortcutScope.SpecificRepository ? parcelableExtra : null);
        }
        return (ShortcutScope.SpecificRepository) parcelable;
    }
}
