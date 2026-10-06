package com.github.rudroid.settings;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import com.github.rudroid.settings.SettingsNotificationSchedulesFragment;
import com.github.rudroid.settings.TimePickerFragment;
import com.github.rudroid.settings.a1;
import com.github.rudroid.settings.preferences.ActionPreference;
import com.github.rudroid.settings.preferences.RadioPreferenceGroup;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c0 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ SettingsNotificationSchedulesFragment s;

    public /* synthetic */ c0(SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment, int i) {
        this.r = i;
        this.s = settingsNotificationSchedulesFragment;
    }

    public final Object k(Object obj) {
        int i = this.r;
        final int i2 = 0;
        w61.a0 a0Var = w61.a0.a;
        final SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment = this.s;
        switch (i) {
            case 0:
                fl.b bVar = (fl.b) obj;
                k71.k.g(bVar, "it");
                ToolBarPreferenceFragmentCompat.y4(settingsNotificationSchedulesFragment, settingsNotificationSchedulesFragment.C3(2131952512));
                bVar.toString();
                return a0Var;
            case 1:
                a1.a aVar = (a1.a) obj;
                k71.k.d(aVar);
                pm.c cVar = aVar.a;
                boolean z = cVar.d;
                PreferenceCategory t4 = settingsNotificationSchedulesFragment.t4("schedules_settings_category");
                if (t4 != null) {
                    t4.D(z);
                }
                SwitchPreferenceCompat t42 = settingsNotificationSchedulesFragment.t4("preference_global_toggle");
                if (t42 != null) {
                    t42.H(z);
                    ((Preference) t42).v = new h0(i2, settingsNotificationSchedulesFragment);
                }
                final LocalTime localTime = cVar.b;
                settingsNotificationSchedulesFragment.B4(localTime.getHour(), "preference_from", localTime.getMinute());
                ActionPreference actionPreference = (ActionPreference) settingsNotificationSchedulesFragment.t4("preference_from");
                final int i3 = 1;
                if (actionPreference != null) {
                    ((Preference) actionPreference).w = new e7.k() { // from class: com.github.rudroid.settings.i0
                        public final void t(Preference preference) {
                            switch (i3) {
                                case 0:
                                    LocalTime localTime2 = localTime;
                                    Integer valueOf = Integer.valueOf(localTime2.getHour());
                                    Integer valueOf2 = Integer.valueOf(localTime2.getMinute());
                                    final int i4 = 0;
                                    final SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment2 = settingsNotificationSchedulesFragment;
                                    final j71.e eVar = new j71.e() { // from class: com.github.rudroid.settings.d0
                                        public final Object s(Object obj2, Object obj3) {
                                            int i5 = i4;
                                            int intValue = ((Integer) obj2).intValue();
                                            int intValue2 = ((Integer) obj3).intValue();
                                            switch (i5) {
                                                case 0:
                                                    settingsNotificationSchedulesFragment2.A4().h(intValue, intValue2);
                                                    break;
                                                default:
                                                    settingsNotificationSchedulesFragment2.A4().C(intValue, intValue2);
                                                    break;
                                            }
                                            return w61.a0.a;
                                        }
                                    };
                                    TimePickerFragment.a aVar2 = TimePickerFragment.Companion;
                                    TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.github.rudroid.settings.e0
                                        @Override // android.app.TimePickerDialog.OnTimeSetListener
                                        public final void onTimeSet(TimePicker timePicker, int i5, int i6) {
                                            eVar.s(Integer.valueOf(i5), Integer.valueOf(i6));
                                        }
                                    };
                                    aVar2.getClass();
                                    TimePickerFragment timePickerFragment = new TimePickerFragment();
                                    timePickerFragment.J0 = onTimeSetListener;
                                    timePickerFragment.K0 = valueOf;
                                    timePickerFragment.L0 = valueOf2;
                                    timePickerFragment.z4(settingsNotificationSchedulesFragment2.x3(), "TIME_PICKER");
                                    break;
                                default:
                                    LocalTime localTime3 = localTime;
                                    Integer valueOf3 = Integer.valueOf(localTime3.getHour());
                                    Integer valueOf4 = Integer.valueOf(localTime3.getMinute());
                                    final int i5 = 1;
                                    final SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment3 = settingsNotificationSchedulesFragment;
                                    final j71.e eVar2 = new j71.e() { // from class: com.github.rudroid.settings.d0
                                        public final Object s(Object obj2, Object obj3) {
                                            int i52 = i5;
                                            int intValue = ((Integer) obj2).intValue();
                                            int intValue2 = ((Integer) obj3).intValue();
                                            switch (i52) {
                                                case 0:
                                                    settingsNotificationSchedulesFragment3.A4().h(intValue, intValue2);
                                                    break;
                                                default:
                                                    settingsNotificationSchedulesFragment3.A4().C(intValue, intValue2);
                                                    break;
                                            }
                                            return w61.a0.a;
                                        }
                                    };
                                    TimePickerFragment.a aVar3 = TimePickerFragment.Companion;
                                    TimePickerDialog.OnTimeSetListener onTimeSetListener2 = new TimePickerDialog.OnTimeSetListener() { // from class: com.github.rudroid.settings.e0
                                        @Override // android.app.TimePickerDialog.OnTimeSetListener
                                        public final void onTimeSet(TimePicker timePicker, int i52, int i6) {
                                            eVar2.s(Integer.valueOf(i52), Integer.valueOf(i6));
                                        }
                                    };
                                    aVar3.getClass();
                                    TimePickerFragment timePickerFragment2 = new TimePickerFragment();
                                    timePickerFragment2.J0 = onTimeSetListener2;
                                    timePickerFragment2.K0 = valueOf3;
                                    timePickerFragment2.L0 = valueOf4;
                                    timePickerFragment2.z4(settingsNotificationSchedulesFragment3.x3(), "TIME_PICKER");
                                    break;
                            }
                        }
                    };
                }
                final LocalTime localTime2 = cVar.c;
                settingsNotificationSchedulesFragment.B4(localTime2.getHour(), "preference_to", localTime2.getMinute());
                ActionPreference actionPreference2 = (ActionPreference) settingsNotificationSchedulesFragment.t4("preference_to");
                if (actionPreference2 != null) {
                    ((Preference) actionPreference2).w = new e7.k() { // from class: com.github.rudroid.settings.i0
                        public final void t(Preference preference) {
                            switch (i2) {
                                case 0:
                                    LocalTime localTime22 = localTime2;
                                    Integer valueOf = Integer.valueOf(localTime22.getHour());
                                    Integer valueOf2 = Integer.valueOf(localTime22.getMinute());
                                    final int i4 = 0;
                                    final SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment2 = settingsNotificationSchedulesFragment;
                                    final j71.e eVar = new j71.e() { // from class: com.github.rudroid.settings.d0
                                        public final Object s(Object obj2, Object obj3) {
                                            int i52 = i4;
                                            int intValue = ((Integer) obj2).intValue();
                                            int intValue2 = ((Integer) obj3).intValue();
                                            switch (i52) {
                                                case 0:
                                                    settingsNotificationSchedulesFragment2.A4().h(intValue, intValue2);
                                                    break;
                                                default:
                                                    settingsNotificationSchedulesFragment2.A4().C(intValue, intValue2);
                                                    break;
                                            }
                                            return w61.a0.a;
                                        }
                                    };
                                    TimePickerFragment.a aVar2 = TimePickerFragment.Companion;
                                    TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.github.rudroid.settings.e0
                                        @Override // android.app.TimePickerDialog.OnTimeSetListener
                                        public final void onTimeSet(TimePicker timePicker, int i52, int i6) {
                                            eVar.s(Integer.valueOf(i52), Integer.valueOf(i6));
                                        }
                                    };
                                    aVar2.getClass();
                                    TimePickerFragment timePickerFragment = new TimePickerFragment();
                                    timePickerFragment.J0 = onTimeSetListener;
                                    timePickerFragment.K0 = valueOf;
                                    timePickerFragment.L0 = valueOf2;
                                    timePickerFragment.z4(settingsNotificationSchedulesFragment2.x3(), "TIME_PICKER");
                                    break;
                                default:
                                    LocalTime localTime3 = localTime2;
                                    Integer valueOf3 = Integer.valueOf(localTime3.getHour());
                                    Integer valueOf4 = Integer.valueOf(localTime3.getMinute());
                                    final int i5 = 1;
                                    final SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment3 = settingsNotificationSchedulesFragment;
                                    final j71.e eVar2 = new j71.e() { // from class: com.github.rudroid.settings.d0
                                        public final Object s(Object obj2, Object obj3) {
                                            int i52 = i5;
                                            int intValue = ((Integer) obj2).intValue();
                                            int intValue2 = ((Integer) obj3).intValue();
                                            switch (i52) {
                                                case 0:
                                                    settingsNotificationSchedulesFragment3.A4().h(intValue, intValue2);
                                                    break;
                                                default:
                                                    settingsNotificationSchedulesFragment3.A4().C(intValue, intValue2);
                                                    break;
                                            }
                                            return w61.a0.a;
                                        }
                                    };
                                    TimePickerFragment.a aVar3 = TimePickerFragment.Companion;
                                    TimePickerDialog.OnTimeSetListener onTimeSetListener2 = new TimePickerDialog.OnTimeSetListener() { // from class: com.github.rudroid.settings.e0
                                        @Override // android.app.TimePickerDialog.OnTimeSetListener
                                        public final void onTimeSet(TimePicker timePicker, int i52, int i6) {
                                            eVar2.s(Integer.valueOf(i52), Integer.valueOf(i6));
                                        }
                                    };
                                    aVar3.getClass();
                                    TimePickerFragment timePickerFragment2 = new TimePickerFragment();
                                    timePickerFragment2.J0 = onTimeSetListener2;
                                    timePickerFragment2.K0 = valueOf3;
                                    timePickerFragment2.L0 = valueOf4;
                                    timePickerFragment2.z4(settingsNotificationSchedulesFragment3.x3(), "TIME_PICKER");
                                    break;
                            }
                        }
                    };
                }
                if (aVar instanceof a1.a.C0005a) {
                    a1.a.C0005a c0005a = (a1.a.C0005a) aVar;
                    RadioPreferenceGroup radioPreferenceGroup = (RadioPreferenceGroup) settingsNotificationSchedulesFragment.t4("radio_group");
                    if (radioPreferenceGroup != null) {
                        SettingsNotificationSchedulesFragment.b[] bVarArr = SettingsNotificationSchedulesFragment.b.r;
                        radioPreferenceGroup.g0.y(2131954497, RadioPreferenceGroup.i0[1]);
                    }
                    List list = c0005a.a.a;
                    ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((pm.b) it.next()).b);
                    }
                    settingsNotificationSchedulesFragment.C4(arrayList, true);
                } else {
                    boolean z2 = aVar instanceof a1.a.b;
                    List list2 = x61.rShadow.r;
                    if (z2) {
                        RadioPreferenceGroup radioPreferenceGroup2 = (RadioPreferenceGroup) settingsNotificationSchedulesFragment.t4("radio_group");
                        if (radioPreferenceGroup2 != null) {
                            SettingsNotificationSchedulesFragment.b[] bVarArr2 = SettingsNotificationSchedulesFragment.b.r;
                            radioPreferenceGroup2.g0.y(2131954498, RadioPreferenceGroup.i0[1]);
                        }
                        settingsNotificationSchedulesFragment.C4(list2, false);
                    } else {
                        if (!aVar.equals(a1.a.c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RadioPreferenceGroup radioPreferenceGroup3 = (RadioPreferenceGroup) settingsNotificationSchedulesFragment.t4("radio_group");
                        if (radioPreferenceGroup3 != null) {
                            SettingsNotificationSchedulesFragment.b[] bVarArr3 = SettingsNotificationSchedulesFragment.b.r;
                            radioPreferenceGroup3.g0.y(2131954498, RadioPreferenceGroup.i0[1]);
                        }
                        settingsNotificationSchedulesFragment.C4(list2, false);
                    }
                }
                return a0Var;
            case 2:
                Boolean bool = (Boolean) obj;
                k71.k.d(bool);
                settingsNotificationSchedulesFragment.x4(bool.booleanValue(), new g0(settingsNotificationSchedulesFragment, i2));
                return a0Var;
            default:
                fl.b bVar2 = (fl.b) obj;
                k71.k.g(bVar2, "it");
                ToolBarPreferenceFragmentCompat.y4(settingsNotificationSchedulesFragment, settingsNotificationSchedulesFragment.C3(2131952512));
                bVar2.toString();
                return a0Var;
        }
    }
}
