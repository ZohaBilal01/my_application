package com.example.navigation;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class ImageSliderAdapter extends SliderViewAdapter<SliderViewHolder>
{
    HomeFragement context;
    List<ImageSliderModel> imageSliderModelList;

    public ImageSliderAdapter(HomeFragement context, List<ImageSliderModel> imageSliderModelList)
    {
        this.context = context;
        this.imageSliderModelList=imageSliderModelList;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {     // we will inflate the whole xml layout of..
                                                                        // slider_term_layout.xml in viewholder class
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_term_layout,parent,false); //parent mein,
                                                                                                                    // root pass nhi krna
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
        viewHolder.SliderImageView.setImageResource(imageSliderModelList.get(position).getImage()); //model ckass k getimage()ko use kr  image get kraingy
       }

    @Override
    public int getCount() {
        return imageSliderModelList.size();
    }
}
class SliderViewHolder extends SliderViewAdapter.ViewHolder {

    ImageView SliderImageView;          //Sliderimages that we need to dispaly
    public SliderViewHolder(View itemView) {
        super(itemView);
        SliderImageView = itemView.findViewById(R.id.imageSliderlayout);     //imagesSliderlayout is placed in slider_term_layout.xml
    }
}