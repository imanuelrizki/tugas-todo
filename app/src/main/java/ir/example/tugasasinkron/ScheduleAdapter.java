package ir.example.tugasasinkron;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {
    private List<Schedule> scheduleList;

    public ScheduleAdapter(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_schedule, parent, false);
        return new ScheduleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, int position) {
        Schedule schedule = scheduleList.get(position);
        holder.tvWhat.setText(schedule.getWhat());
        holder.tvTime.setText(schedule.getTime());
    }

    @Override
    public int getItemCount() {
        return scheduleList.size();
    }

    public static class ScheduleViewHolder extends RecyclerView.ViewHolder {
        TextView tvWhat, tvTime;

        public ScheduleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvWhat = itemView.findViewById(R.id.tv_what);
            tvTime = itemView.findViewById(R.id.tv_time);
        }
    }
}