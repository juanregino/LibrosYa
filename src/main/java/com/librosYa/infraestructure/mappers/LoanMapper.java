package com.librosYa.infraestructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.librosYa.api.dto.request.LoanRequest;
import com.librosYa.api.dto.response.LoanAllResponse;
import com.librosYa.domain.entities.Loan;

@Mapper(componentModel = "spring" , uses = {UserMapper.class, BookMapper.class})
public interface LoanMapper {


    @Mappings({
      @Mapping(target = "id", ignore = true),
      @Mapping(target = "bookId.id", source = "bookId"),
      @Mapping(target = "userId.id", source = "userId")
  })
  Loan toLoan(LoanRequest loanRequest); 

     LoanAllResponse toLoanResponse(Loan loan);

     @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "bookId.id", source = "bookId"),
            @Mapping(target = "userId.id", source = "userId")
    })
  void updateFromLoanRequest(LoanRequest loanRequest, @MappingTarget Loan loan);
}
