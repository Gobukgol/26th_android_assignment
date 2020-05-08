package com.example.a26th_2nd_seminar

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 */
class HomeFragment : Fragment() {
    lateinit var instaAdapter: InstaAdapter
    val datas = mutableListOf<InstaData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instaAdapter = InstaAdapter(view.context)
        rv_home.adapter = instaAdapter //리사이클러뷰의 어댑터를 instaAdapter로 지정해줌
        loadDatas()//데이터를 임의로 생성하고 어댑터에 전달해주겠습니다!
    }

    private fun loadDatas(){
        datas.apply {
            add(
                InstaData(
                    userName = "이소민",
                    img_profile = "https://cdn.pixabay.com/photo/2020/04/17/10/28/apple-blossom-5054129__340.jpg",
                    img_contents = "https://cdn.pixabay.com/photo/2020/04/24/11/45/model-car-5086548__340.jpg"

            ))
            add(
                InstaData(
                    userName = "안드로이드",
                    img_profile = "https://cdn.pixabay.com/photo/2020/04/12/08/39/squirrel-5033329__340.jpg",
                    img_contents = "https://cdn.pixabay.com/photo/2020/04/18/19/06/tulips-5060612__340.jpg"

                ))
            add(
                InstaData(
                    userName = "이소민",
                    img_profile = "https://cdn.pixabay.com/photo/2020/03/21/19/27/sea-4955005__340.jpg",
                    img_contents = "https://cdn.pixabay.com/photo/2020/04/21/18/21/nature-5074166__340.jpg"

                ))
        }
        instaAdapter.datas = datas
        instaAdapter.notifyDataSetChanged()
    }


}
