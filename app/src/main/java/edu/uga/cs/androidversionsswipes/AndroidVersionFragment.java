package edu.uga.cs.androidversionsswipes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AndroidVersionFragment extends Fragment {

    // Array of Android version code names
    private static final String[] androidVersions = {
            "13",
            "12",
            "11",
            "10",
            "Pie",
            "Oreo",
            "Nougat",
            "Marshmallow",
            "Lollipop",
            "KitKat",
            "Jelly Bean",
            "Ice Cream Sandwich",
            "Honeycomb",
            "Gingerbread",
            "Froyo",
            "Eclair",
            "Donut",
            "Cupcake",
            "Petit Four",
            "Android (No codename)"
    };

    // Array of Android version highlights/brief descriptions
    private static final String[] androidVersionsInfo = {
            "13\nAugust 16, 2022\n\nAndroid 13 is the thirteenth major version of the Android operating system. It was first announced on 10 Feb 2022 by Google and its beta1 version was first released on 26 Apr 2022.\n\nIn Android 13, apps are now required to request permission from the user before they are able to send notifications.  The new system added support for Bluetooth LE Audio and the LC3 audio codec. ART has been updated with a new garbage collector (GC) utilizing the Linux userfaultfd system call.",
            "12\nOctober 4, 2021\n\nAndroid 12 is the twelfth major version of the Android operating system. It was first announced by Google on February 18, 2021, and the first developer preview released on the same day.\n\nAndroid 12 started using Material You, an updated design language based on Material Design.  It introduced the scrolling screenshot, one handed mode, mic and camera indicator and toggle, privacy dashboard and other new features.",
            "11\nSeptember 8, 2020\n\nAndroid 11 is the eleventh major version of the Android operating system. It was first announced by Google on February 19, 2020, and the first developer preview released on the same day.\n\nThe logo for the release features a dial turned to 11.\n\nAndroid 11 added chat bubbles, screen recorder, notification history, new permissions controls and other new features.",
            "10\nSeptember 3, 2019\n\nAndroid 10 is the tenth major version of the Android operating system. It was first announced by Google on March 13, 2019, and the first beta was released on the same day (under the name \"Android Q\" at the time).\nAndroid 10 was going to be known as \"Queen Cake\". Internally, Android 10 is known as Quince Tart.",
            "Pie\n9.0\nAugust 6, 2018\n\nAndroid Pie is the ninth major version of the Android operating system. It was first announced by Google on March 7, 2018, and the first developer preview was released on the same day. Second preview, considered beta quality, was released on May 8, 2018. The final beta of Android P (fifth preview, also considered as a \"Release Candidate\") was released on July 25, 2018. The first official release was released on August 6, 2018.",
            "Oreo\n8.0 – 8.1\nAugust 21, 2017\n\nAndroid Oreo is the 8th major release of the Android operating system. It was first released as a developer preview on March 21, 2017, with factory images for current Nexus and Pixel devices. The final developer preview was released on July 24, 2017, with the stable version released in August 2017.",
            "Nougat\n7.0 – 7.1.2\nAugust 22, 2016\n\nAndroid \"Nougat\" (codenamed N in-development) is the major 7.0 release of the Android operating system. It was first released as a developer preview on March 9, 2016, with factory images for current Nexus devices, as well as with the new \"Android Beta Program\" which allows supported devices to be upgraded directly to the Android Nougat beta via over-the-air update. Final release was on August 22, 2016. The final preview build was released on July 18, 2016, with the build number NPD90G.",
            "Marshmallow\n6.0 – 6.0.1\nOctober 5, 2015\n\nAndroid 6.0 \"Marshmallow\" was unveiled under the codename \"Android M\" during Google I/O on May 28, 2015, for the Nexus 5 and Nexus 6 phones, Nexus 9 tablet, and Nexus Player set-top box, under the build number MPZ44Q. The third developer preview (MPA44G) was released on August 17, 2015 for the Nexus 5, Nexus 6, Nexus 9 and Nexus Player devices, and was updated to MPA44I that brought fixes related to Android for Work profiles.",
            "Lollipop\n5.0 – 5.1.1\nNovember 12, 2014\n\nAndroid 5.0 \"Lollipop\" was unveiled under the codename \"Android L\" on June 25, 2014, during Google I/O. It became available as official over-the-air (OTA) updates on November 12, 2014, for select devices that run distributions of Android serviced by Google, including Nexus and Google Play edition devices. Its source code was made available on November 3, 2014. Lollipop features a redesigned user interface built around a responsive design language referred to as \"material design\". Other changes include improvements to the notifications, which can be accessed from the lockscreen and displayed within applications as top-of-the-screen banners. Furthermore, Google made internal changes to the platform, with the Android Runtime (ART) officially replacing Dalvik for improved application performance, and with changes intended to improve and optimize battery usage, known internally as Project Volta.",
            "KitKat\n4.4 – 4.4.4\nOctober 31, 2013\n\nGoogle announced Android 4.4 KitKat on September 3, 2013. Although initially under the \"Key Lime Pie\" (\"KLP\") codename, the name was changed because \"very few people actually know the taste of a key lime pie.\" Some technology bloggers also expected the \"Key Lime Pie\" release to be Android 5. KitKat debuted on Google's Nexus 5 on October 31, 2013, and was optimized to run on a greater range of devices than earlier Android versions, having 512 MB of RAM as a recommended minimum; those improvements were known as \"Project Svelte\" internally at Google.",
            "Jelly Bean\n4.1 – 4.3.1\nJuly 9, 2012\n\nGoogle announced Android 4.1 (Jelly Bean) at the Google I/O conference on June 27, 2012. Based on Linux kernel 3.0.31, Jelly Bean was an incremental update with the primary aim of improving the functionality and performance of the user interface. The performance improvement involved \"Project Butter\", which uses touch anticipation, triple buffering, extended vsync timing and a fixed frame rate of 60 fps to create a fluid and \"buttery-smooth\" UI.",
            "Ice Cream Sandwich\n4.0 – 4.0.4\nOctober 18, 2011\n\nThe SDK for Android 4.0.1 (Ice Cream Sandwich), based on Linux kernel 3.0.1, was publicly released on October 19, 2011. Google's Gabe Cohen stated that Android 4.0 was \"theoretically compatible\" with any Android 2.3.x device in production at that time. The source code for Android 4.0 became available on November 14, 2011. Ice Cream Sandwich was the last version to officially support Adobe Systems'Flash player. The update introduced numerous new features.",
            "Honeycomb\n3.0 – 3.2.6\nFebruary 22, 2011\n\nAndroid 3.0 (Honeycomb) SDK – the first tablet-only Android update – was released, based on Linux kernel 2.6.36. The first device featuring this version, the Motorola Xoom tablet, was released on February 24, 2011.",
            "Gingerbread\n2.3 – 2.3.7\nDecember 6, 2010\n\nAndroid 2.3 (Gingerbread) SDK was released, based on Linux kernel 2.6.35. Many changes weer included.",
            "Froyo\n2.2 – 2.2.3\nMay 20, 2010\n\nSDK for Android 2.2 (Froyo, short for frozen yogurt) was released, based on Linux kernel 2.6.32.",
            "Eclair\n2.0 – 2.1\nOctober 26, 2009\n\nAndroid 2.0 SDK was released, based on Linux kernel 2.6.29 and codenamed Eclair. Changes include the ones listed below.",
            "Donut\n1.6\nSeptember 15, 2009\n\nAndroid 1.6 – dubbed Donut – was released, based on Linux kernel 2.6.29. Included in the update were numerous new features.",
            "Cupcake\n1.5\nApril 27, 2009\n\nAndroid 1.5 update was released, based on Linux kernel 2.6.27. This was the first release to officially use a codename based on a dessert item (\"Cupcake\"), a theme which would be used for all releases henceforth. The update included several new features and UI amendments.",
            "Petit Four\n1.1\nFebruary 9, 2009\n\nAndroid 1.1 update was released, initially for the HTC Dream only. Android 1.1 was known as \"Petit Four\" internally, though this name was not used officially. The update resolved bugs, changed the Android API and added a number of features.",
            "Initial Android\nVersions: 1.0\nSeptember 23, 2008\n\nThe first commercial version of the software, was released on September 23, 2008. The first commercially available Android device was the HTC Dream. Android 1.0 incorporated the following features:"
    };

    // which Android version to display in the fragment
    private int versionNum;

    public AndroidVersionFragment() {
        // Required empty public constructor
    }


    public static AndroidVersionFragment newInstance( int versionNum ) {
        AndroidVersionFragment fragment = new AndroidVersionFragment();
        Bundle args = new Bundle();
        args.putInt( "versionNum", versionNum );
        fragment.setArguments( args );
        return fragment;
    }

    @Override
    public void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        if( getArguments() != null ) {
            versionNum = getArguments().getInt( "versionNum" );
        }
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_android_version, container, false );
    }

    @Override
    public void onViewCreated( @NonNull View view, Bundle savedInstanceState ) {
        //public void onActivityCreated(Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );

        TextView titleView = view.findViewById( R.id.titleView );
        TextView highlightsView = view.findViewById( R.id.highlightsView );

        titleView.setText( androidVersions[ versionNum ] );
        highlightsView.setText( androidVersionsInfo[ versionNum ] );
    }

    public static int getNumberOfVersions() {
        return androidVersions.length;
    }
}