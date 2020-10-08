package ru.job4j.stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Profiles {
    public List<Address> collect(List<Profile> profiles){
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .collect(Collectors.toList());
    }

    public List<Address> collectUniq(List<Profile> profiles){
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
